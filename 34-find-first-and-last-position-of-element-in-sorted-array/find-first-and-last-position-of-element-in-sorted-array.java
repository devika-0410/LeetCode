class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1, -1};

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int [] nums, int target){
        int left = 0, right = nums.length - 1;
        int idx = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                idx = mid;
                right = mid - 1; 
            }
        }
        return idx;
    }

    private int findLast(int [] nums, int target){
        int left = 0, right = nums.length - 1;
        int idx = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                idx = mid;
                left = mid + 1; 
            }
        }
        return idx;
    }
}