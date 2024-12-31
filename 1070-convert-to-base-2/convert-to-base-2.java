class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int remainder = n % -2;
            n /= -2;
            // sometimes remainder will be -1: -3 % -2 = -1
//we have to convert to 1.so add 2: rem+=2
//when remainder is added by 2 the quotient increase by 1:n+=1
//example:  6%3=0 --> to increase remainder by 2 ,increase the divided by 2
// -->8%3=2
//the quotient increases by 1 as dividided increases by 2
//as divided increases by 2 -->there is one extra 2-->quiotient is increased by 1
            if (remainder < 0) {
                remainder += 2;
                n += 1;
            }
            result.append(remainder);
        }
        return result.reverse().toString();
    }
}
