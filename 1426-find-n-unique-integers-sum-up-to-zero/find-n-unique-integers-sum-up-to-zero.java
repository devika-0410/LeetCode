class Solution {
    public int[] sumZero(int n) {
        int[] arr= new int[n];
        int left = 0, right = n - 1;

        int num = 1;
        while(left < right){
            arr[left++] = num;
            arr[right--] = -num;
            num++;
        }
        return arr;
    }
}