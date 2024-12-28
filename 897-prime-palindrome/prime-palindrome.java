class Solution {
    public int primePalindrome(int n) {
        while(true){
            //all even digit numbers pallindrome numbers are not prime except 11
            //  22 is not prime
            //    1221 is not prime
            //      so we need to skip the values
            //   skip from 22 to 100 as 22,33,44,55,... are not prime
            //   so 10^2=100...the  power 2 is length of integer..in case of 22 it is 2..
            if (n > 11 && String.valueOf(n).length()%2==0) {
                n=(int)Math.pow(10,String.valueOf(n).length());
            }
            if(isprime(n) && ispallindrome(n)){
                return n;
            }
            n++;
        }

    }
    private boolean ispallindrome(int num){
        // String s=String.valueOf(n);
        // int i=0;
        // int j=s.length()-1;
        // while(j>i){
        //     if(s.charAt(i)!=s.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;
       int temp=num;
       int rev=0;

        while (num>0) {
            rev=rev*10+num%10;
            num/=10;
        }
        return temp==rev;
    }
    private boolean isprime(int n){
        if(n<=1){
            return false;
        }
        // i<= sqrt(n)
        // i^2<=n
        for (int i = 2; i*i<= n; i += 1) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}