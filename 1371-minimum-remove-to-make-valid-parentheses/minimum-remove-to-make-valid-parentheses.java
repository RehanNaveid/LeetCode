class Solution {
    public String minRemoveToMakeValid(String s1) {
        StringBuilder str=new StringBuilder(s1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<s1.length();i++){
            if(str.charAt(i)=='('){
                s.push(i);
            }
            else if(str.charAt(i)==')'){
                if(!s.isEmpty()){
                    s.pop();
                }
                else{
                    str.setCharAt(i,'*');
                }
            }
        }
        while(!s.isEmpty()){
            str.setCharAt(s.pop(),'*');
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(str.charAt(i)!='*')
                res.append(str.charAt(i));
        }
        return res.toString();
    }
}