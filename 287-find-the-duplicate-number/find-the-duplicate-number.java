class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            int c=m.get(i);
            if(c>1){
                return i;
            }
        }
        return -1;
    }
}