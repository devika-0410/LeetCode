class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length && j < arr.length; i++){
            if(arr[i] == 0){
                arr2[j++] = 0;
                if(j < arr.length){
                    arr2[j++] = 0;
                }
            }
            else{
                arr2[j++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr2[i];
        }
    }
}