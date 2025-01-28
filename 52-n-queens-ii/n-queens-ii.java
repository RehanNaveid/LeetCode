class Solution {
    int c=0;//count
    public int totalNQueens(int n) {
        int arr[][]=new int[n][n];
        queenplace(arr,n,0);//start from 0th row
        return c;
    }
    public void queenplace(int arr[][],int n,int row){
        if(row==n){
            c++;//count increases for every distinct solution
        }
        else{
            for(int col=0;col<n;col++){
                if(isSafe(arr,row,col)==1){//if a position is safe
                    arr[row][col]=1;
                    queenplace(arr,n,row+1);//move to next row
                    arr[row][col]=0;//backtracking
                }
            }
        }
    }
    public int isSafe(int arr[][],int row,int col){
        for(int i=row;i>=0;i--){//top
            if(arr[i][col]==1)
            return 0;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){//diagonal
            if(arr[i][j]==1)
            return 0;
        }
        for(int i=row,j=col;i>=0&&j<arr[0].length;i--,j++){//minor diagnoal
            if(arr[i][j]==1)
            return 0;
        }
        return 1;
    }
}