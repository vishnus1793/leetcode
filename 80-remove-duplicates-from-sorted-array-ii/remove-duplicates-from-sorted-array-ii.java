class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int k=0;
        for(int i:nums){
            int c=m.get(i);
            if(c>0){
                if(c>=2){
                    nums[k++]=i;
                }
                nums[k++]=i;
                m.put(i,0);
            }
        }
        return k;
    }
}