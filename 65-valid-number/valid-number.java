class Solution {
    public boolean isNumber(String s) {
        boolean digit=false;
        boolean sign=false;
        boolean exponent=false;
        boolean dot=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                digit=true;
            }
            else if(ch=='e'||ch=='E'){
                if(!digit||exponent)
                    return false;
                else{
                    exponent=true;
                    digit=false;
                    sign=false;
                    dot=false;
                }

            }
            else if(ch=='+'||ch=='-'){
                if(sign||digit||dot){
                    return false;
                }
                else{
                    sign=true;
                }
            }
            else if(ch=='.'){
                if(exponent||dot){
                    return false;
                }
                else{
                    dot=true;
                }
            }
            else{
                return false;
            }
        }
        return digit;
    }
}