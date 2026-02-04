class Solution {
    public boolean isSafe(int[][] arr,int r,int c,int n){
        for(int i=0;i<r;i++){
            if(arr[i][c]==1)return false;
        }
        // for(int i=0;i<c;i++){
        //     if(arr[r][i]==1)return false;
        // }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1)return false;
        }
        for(int i=r,j=c;i>=0 && j<n;i--,j++){
            if(arr[i][j]==1)return false;
        }

        return true;
    }


    public List<List<String>> solveNQueens(int n) {
        int[][] arr=new int[n][n];
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }
        }
        solve(arr,res,0,n);
        return res;
    }

    public void solve(int[][] arr,List<List<String>> res,int r,int n){
        if(r==n){
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                char[] ch=new char[n];
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1)ch[j]='Q';
                    else ch[j]='.';
                }
                list.add(String.valueOf(ch));
            }
            res.add(list);
        }
        else{
            for(int c=0;c<n;c++){
                if(isSafe(arr,r,c,n)){
                    arr[r][c]=1;
                    solve(arr,res,r+1,n);
                    arr[r][c]=0;
                }
            }
        }
    }
}