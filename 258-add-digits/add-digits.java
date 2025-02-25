class Solution {
    public int add(int a){
        int v=0;
        while(a>0){
            int n=a%10;
            v+=n;
            a/=10;
        }
        return v;
    }

    public int addDigits(int num) {
        while(num>=10){
            num=add(num);
        }
        return num;
    }
}