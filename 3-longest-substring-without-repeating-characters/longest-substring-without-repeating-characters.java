class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> res = new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(!res.contains(s.charAt(j))){
                res.add(s.charAt(j));
                j++;
                max = Math.max(res.size(),max);
            }
            else{
                res.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}