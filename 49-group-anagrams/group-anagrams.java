class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> m = new HashMap<>();
        for (String i : strs){
            char [] c =i.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!m.containsKey(s)){
                m.put(s,new ArrayList<>());
            }
            m.get(s).add(i);
        }
        return new ArrayList<>(m.values());
    }
}