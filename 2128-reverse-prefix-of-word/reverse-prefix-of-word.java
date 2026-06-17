class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int count = -1;
        for(int i = 0; i < n; i++){
            if(word.charAt(i) == ch){
                count = i;
                break;
            }      
        }

        if(count == -1)
            return word;


        String a = word.substring(0, count+1);
        String b = word.substring(count+1);

        StringBuilder sb = new StringBuilder(a);

        return sb.reverse().toString() + b;
    }
}