class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int m=0;
        List<Boolean> a = new ArrayList<>();
        for(int i:candies){
            if(m<i){
                m=i;
            }
        }
        for(int i:candies){
            if(i+e>=m){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}