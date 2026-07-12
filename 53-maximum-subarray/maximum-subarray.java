class Solution {
    public int maxSubArray(int[] nums) {
        int n = 0;
        int sum = nums[0];
        for(int i = 0; i < nums.length; i++){
            n = n + nums[i];
            if(sum < n){
                sum = n;
            }
            if(n < 0){
                n = 0;
            }
        }
        return sum;
    }
}