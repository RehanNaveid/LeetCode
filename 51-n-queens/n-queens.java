class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }
        }
        queenplace(res,n,arr,0);
        return res;
    }
    public  void queenplace( List<List<String>> res,int n,int[][] arr,int row)
    {
        int col;
        if(row==n){
            List<String> lst=new ArrayList<>();
            for(int i=0;i<n;i++){
                char ch[]=new char[n];
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1)
                    ch[j]='Q';
                    else
                    ch[j]='.';
                }
                lst.add(String.valueOf(ch));
            }
            res.add(lst);
        }
        else{
            for(col=0;col<n;col++){
                if(isSafe(arr,row,col)==1){
                    arr[row][col]=1;
                    queenplace(res,n,arr,row+1);
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