class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         for(int j = i; j < nums.length - 1; j++){
        //             nums[j] = nums[j + 1];
        //         }
        //         nums[nums.length - 1] = 0;
        //         i--;
        //     } 
        // }
       int j = 0;
       for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
       }
       while(j < nums.length){
            nums[j] = 0;
            j++;
       }
    }
}