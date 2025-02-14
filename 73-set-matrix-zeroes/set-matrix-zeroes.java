class Solution {
    public void setrows(int[][]matrix,int row,int col){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]!=0)
            matrix[i][col]=-1;
        }
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[row][j]!=0)
            matrix[row][j]=-1;
        }
    }
    public void setZeroes(int[][] matrix) {
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}