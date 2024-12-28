class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}
//25!=6 trailing zeros
//20!=4 training zeros
//5!=1 trailing zero

//example:25!
//   25/5=5
//    quotient 5 is >=5
//      again divide by 5
//         5/5=1
//           add both the quotient:5+1=6 trailing zeros

//example:24!
//   24/5=4
//    loop stops...trailing zeros=4