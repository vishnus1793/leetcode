class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.keySet()){
            if(m.get(i)>n/3){
                l.add(i);
            }
        }
        return l;
    }
}
