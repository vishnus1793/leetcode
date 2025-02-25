class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(int l:nums){
            if(target<l || l==target){
                return i;
            }
            i++;
        }
        return i;
    }
}