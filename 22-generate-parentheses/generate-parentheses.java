class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        char[] s=new char[n*2];
        solve(s,str,n,0,0,0);
        return str;
    }
    public void solve(char[] s,List<String> str,int n,int ind,int open,int close)
    {
        if(ind==2*n){
            str.add(String.valueOf(s));
        }
        else{
            if(open<n){
                s[ind]='(';
                solve(s,str,n,ind+1,open+1,close);
            }
            if(close<open){
                s[ind]=')';
                solve(s,str,n,ind+1,open,close+1);
            }
        }
    }
}
