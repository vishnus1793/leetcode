import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(a.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}