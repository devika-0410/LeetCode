class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for(int h : heights){
            count[h]++;
        }
        int index = 0;
        int mismatch = 0;
        for(int i = 0; i <= 100; i++){
            while(count[i] > 0){
                if(heights[index] != i){
                    mismatch++;
                }
                index++;
                count[i]--;
            } 
        }
        return mismatch;
    }
}