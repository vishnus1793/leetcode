class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int n = nums.length/2;
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
            if(a.get(i)>n){
                return i;
            }
        }
        return -1;
        
    }
}