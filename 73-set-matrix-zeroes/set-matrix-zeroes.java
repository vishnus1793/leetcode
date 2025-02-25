class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] r = new boolean[m];
        boolean[] c = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(r[i]){
                row(matrix,i);
            }
        }
        for(int j=0;j<n;j++){
            if(c[j]){
                col(matrix,j);
            }
        }
    }
        private void row(int[][] matrix, int k){
            for(int j=0;j<matrix[0].length;j++){
                matrix[k][j]=0;
            }
        }
        private void col(int[][] matrix, int k){
            for(int i=0;i<matrix.length;i++){
                matrix[i][k]=0;
            }
        }
    }
