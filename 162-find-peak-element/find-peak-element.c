int findPeakElement(int* nums, int numsSize) {
    int peakIndex = 0;

    for (int i = 1; i < numsSize - 1; i++) {
        if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
            peakIndex = i;  // update if peak found
        }
    }

    // Edge cases: first or last element can be peak
    if (numsSize >= 2) {
        if (nums[0] > nums[1]) {
            peakIndex = 0;
        }
        if (nums[numsSize - 1] > nums[numsSize - 2]) {
            peakIndex = numsSize - 1;
        }
    }

    return peakIndex;
}