class Solution {
    public int primePalindrome(int n) {
        while(true){
            if (n > 11 && String.valueOf(n).length()%2==0) {
                n=(int)Math.pow(10,String.valueOf(n).length());
            }
            if(isprime(n) && ispallindrome(n)){
                return n;
            }
            n++;
        }

    }
    private boolean ispallindrome(int n){
        String s=String.valueOf(n);
        int i=0;
        int j=s.length()-1;
        while(j>i){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i += 1) { // Increment by 2 for odd numbers only.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}