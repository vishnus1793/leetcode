class Solution {
    public int[] searchRange(int[] nums, int target) {
        int r1 = -1, r2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                r1 = i;
                break;
            }
        }
        if (r1 == -1) {
            return new int[]{-1, -1};
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                r2 = i;
                break;
            }
        }
        return new int[]{r1, r2};
    }
}
