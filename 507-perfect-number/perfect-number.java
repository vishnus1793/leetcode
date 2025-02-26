class Solution {
    public boolean checkPerfectNumber(int num) {
        int v=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            v+=i;
        }
    }
    if(v==num){
        return true;
    }
    else{
        return false;
    }
    }
}