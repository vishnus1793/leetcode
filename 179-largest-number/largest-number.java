class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                String o1 = s1+s2;
                String o2 = s2+s1;
                return o2.compareTo(o1);
            }
        });
        if(s[0].equals("0")){
            return "0";
        }
        StringBuilder r = new StringBuilder();
        for(String i:s){
            r.append(i);
        }
        return r.toString();

    }
}