class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int l,b;
        int area,max_area=0;
        while(i<j){
            l=Math.min(height[i],height[j]);
            b=j-i;
            area=l*b;
            max_area=Math.max(area,max_area);
            if(height[i]<height[j]){
                i++;
                
            }
            else{
                j--;
            }
        }
        return max_area;
    }
}