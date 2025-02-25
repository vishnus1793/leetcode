class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    public void rev(int[] nums,int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}