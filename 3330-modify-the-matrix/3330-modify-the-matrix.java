class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] maxInColumn=new int[n];

        Arrays.fill(maxInColumn,Integer.MIN_VALUE);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]!=-1){
                     maxInColumn[j] = Math.max(maxInColumn[j], matrix[i][j]);
                }
            }
        }
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxInColumn[j];
                }
            }
        }
        return matrix;
    }
}