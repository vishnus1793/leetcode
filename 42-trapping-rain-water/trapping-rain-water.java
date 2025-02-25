class Solution {
    public int trap(int[] height) {
        int l[]=new int[height.length];
        int r[]=new int [height.length];
        int a=0;
        for(int i=0;i<height.length;i++){
            a=Math.max(a,height[i]);
            l[i]=a;
        }
        a=0;
        for(int j=height.length-1;j>=0;j--){
            a=Math.max(a,height[j]);
            r[j]=a;
        }
        a=0;
        int b=0;
        for(int i=0;i<height.length;i++){
            a=Math.min(l[i],r[i]);
            a=a-height[i];
            if(a>0){
                b+=a;
            }
        }
        return b;

    }
}