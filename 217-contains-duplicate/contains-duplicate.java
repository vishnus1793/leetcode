class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Boolean r=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                r = true;
            }
        }
        
        return r;
}
}