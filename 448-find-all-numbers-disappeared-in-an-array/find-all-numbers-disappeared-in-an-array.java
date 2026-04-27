class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int index = 1;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(index)){
                l1.add(index);
                index++;
            }
            else{
                index++;
            }
        }
        return l1;
    }
}