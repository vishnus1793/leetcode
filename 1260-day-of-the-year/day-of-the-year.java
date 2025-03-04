class Solution {
    public int dayOfYear(String date) {
        int days = 0;
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] year = date.split("-");
        int y = Integer.valueOf(year[0]);
        int month = Integer.valueOf(year[1]);
        int day = Integer.valueOf(year[2]);
        boolean leap = false;
        for(int i = 0; i < month-1; i++){
            days = days+arr[i];
        }
        days = days+day;
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }
        if(leap==true && month>2){
            days = days+1;
        }
        return days;
    }
}