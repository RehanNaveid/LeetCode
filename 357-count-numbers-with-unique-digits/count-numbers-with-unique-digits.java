class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;// range from 0 to 10^0: 0 to 1: 1
        }
        if(n==1){
            return 10;// count when n=0 + n=1 : 1+9 : 10
         }
        int result=10;
        int ans=9;
        int place=9;
        int i=2;
        while(i<=n){
            ans=ans*place;
            result+=ans;
            place--;
            i++;
        }
        return result;

        
    }
}