class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n>0){
            int l = n%10;
            n/=10;
            p*=l;
            s+=l;
        }
        return (p-s);
    }
}