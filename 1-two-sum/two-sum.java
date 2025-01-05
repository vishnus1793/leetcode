class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s = t - nums[i];
            if(m.containsKey(s)){
                return new int[]{m.get(s),i};
            }
            m.put(nums[i],i);
        }
        return null;
    }
}