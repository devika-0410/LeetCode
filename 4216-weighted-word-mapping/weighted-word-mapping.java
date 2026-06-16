class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] ans = new char[words.length];
        for(int i = 0; i < words.length; i++){
            int sumWeight = 0;
            for(char ch: words[i].toCharArray()){
                sumWeight += weights[ch - 'a'];
            }
            int value = sumWeight % 26;
            ans[i] = (char)('z' - value);
        }
        return new String(ans);
    }
}