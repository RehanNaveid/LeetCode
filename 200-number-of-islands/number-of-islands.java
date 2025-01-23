class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    isIsland(grid,r,c,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void isIsland(char[][] arr,int r,int c,int i,int j){
        if(i==-1||i==r||j==-1||j==c||arr[i][j]=='0'||arr[i][j]=='2'){
            return;
        }
        else{
            arr[i][j]='2';//visited
            isIsland(arr,r,c,i-1,j);//top
            isIsland(arr,r,c,i+1,j);//bottom
            isIsland(arr,r,c,i,j+1);//right
            isIsland(arr,r,c,i,j-1);//left
        }
    }
}