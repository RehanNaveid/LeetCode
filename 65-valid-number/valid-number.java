class Solution {
    public boolean isNumber(String s) {
        boolean digit=false;
        boolean sign=false;
        boolean exponent=false;
        boolean dot=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                digit=true;//no preconditions for digits...can be +,-,e,. before and after digits
            }
            else if(ch=='e'||ch=='E'){
                if(!digit||exponent)//checks whether any previous states has e...a number can have only one e
                //or the previous state that is not digit is always invalid
                    return false;
                else{//current state
                    exponent=true;
                    digit=false;
                    sign=false;
                    dot=false;
                }

            }
            else if(ch=='+'||ch=='-'){
                if(sign||digit||dot){//previous state that is digit ,sign,dot is invalid
                    return false;
                }
                else{
                    sign=true;
                }
            }
            else if(ch=='.'){
                if(exponent||dot){//dot after exponent is invalid
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
        return digit;//last state should contain digit 
    }
}