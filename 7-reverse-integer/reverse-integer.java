import java.util.*;
class Solution {
    public int reverse(int x) {
        int temp=0;
        while(x!=0){
            int rem=x%10;
            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            temp=temp*10+rem;
            x/=10;
        }
        return temp;
    }
}