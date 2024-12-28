import java.util.*;
class Solution {
    public boolean isPalindrome(int n) {
        int temp=Math.abs(n);
        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            n/=10;
            rev=(rev*10)+rem;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}