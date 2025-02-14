class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length-1;
        int rotated[][]=new int[n+1][n+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                rotated[j][n-i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rotated[i][j];
            }
        }
    }
}