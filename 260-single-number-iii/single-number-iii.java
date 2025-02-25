class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(m.get(i)==1){
                a.add(i);
            }
        }
        int[] r = new int[a.size()];
        for(int i=0;i<a.size();i++){
            r[i]=a.get(i);
        }
        return r;
    }
}