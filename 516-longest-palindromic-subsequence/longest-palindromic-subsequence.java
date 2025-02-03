class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
         String s2="";
        for(int i=n-1;i>=0;i--){
            s2=s2+s.charAt(i);
        }
        int arr[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];//1+diagonal
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);//max(top,left)
                }
            }
        }
    return arr[n][n];//last element
    }
}
