class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Map<Integer, Integer> m=new HashMap();
        
        for(int i=0; i<n; i++){
            if( m.containsKey(arr[i]*2)){
                return true;
            }
            else if(arr[i]%2==0 && m.containsKey(arr[i]/2)){
                return true;
            }
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);            
        }

        return false;
    }
}