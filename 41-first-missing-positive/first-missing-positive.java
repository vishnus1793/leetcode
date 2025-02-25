class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i] >= nums.length+1 ){
                nums[i] = nums.length +1;
            }
        }
        for(int i=0;i<nums.length;i++){
            int e = Math.abs(nums[i]);
            if(e==nums.length+1){
                continue;
            }
            int s = e -1;
            if(nums[s] > 0 ){
                nums[s] =-nums[s];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}