class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean r = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    r=true;
                }
            }
        }
        return r;
    }
}