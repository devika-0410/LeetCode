class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] output = new int[n];
    
        for(int i = 0; i < n; i++){
            int degree = 0;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    degree++;
                }
            }
            output[i] = degree;
        }
        return output;
    }
}