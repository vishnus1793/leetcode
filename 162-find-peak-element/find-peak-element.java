class Solution {
    public int findPeakElement(int[] nums) {
        int c=0;
        int m=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                c=i;
            }
        }
        return c;
    }
}