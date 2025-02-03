class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();//abc-3
        int n2=text2.length();//bc-2
        int arr[][]=new int[n1+1][n2+1];//[4][3]
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];//1+diagonal
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);//max(top,left)
                }
            }
        }
    return arr[n1][n2];//last element
    }
}