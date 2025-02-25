public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] re = new int[n];
        int l=1,r=1;
        for(int i=0;i<n;i++){
            re[i]=l;
            l*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            re[i]*=r;
            r*=nums[i];
        }
        return re;
    }
}
