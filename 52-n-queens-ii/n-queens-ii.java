class Solution {
    int c=0;
    public int totalNQueens(int n) {
        int arr[][]=new int[n][n];
        queenplace(arr,n,0);
        return c;
    }
    public void queenplace(int arr[][],int n,int row){
        if(row==n){
            c++;
        }
        else{
            for(int col=0;col<n;col++){
                if(isSafe(arr,row,col)==1){
                    arr[row][col]=1;
                    queenplace(arr,n,row+1);
                    arr[row][col]=0;
                }
            }
        }
    }
    public int isSafe(int arr[][],int row,int col){
        for(int i=row;i>=0;i--){
            if(arr[i][col]==1)
            return 0;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(arr[i][j]==1)
            return 0;
        }
        for(int i=row,j=col;i>=0&&j<arr[0].length;i--,j++){
            if(arr[i][j]==1)
            return 0;
        }
        return 1;
    }
}