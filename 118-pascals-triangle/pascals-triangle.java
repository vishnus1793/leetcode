class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        int k=1;
        for(int i=1;i<=numRows;i++){
            k=1;
            List<Integer>a1=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    a1.add(1);
                }
                else{
                    k=(k*(i-j)/j);
                    a1.add(k);
                }
            }
            a.add(a1);
        }
        return a;
    }
}