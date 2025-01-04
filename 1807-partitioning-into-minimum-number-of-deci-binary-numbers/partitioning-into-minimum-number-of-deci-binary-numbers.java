// class Solution {
//     public int minPartitions(String n) {
//         int max=0;
//         for(int i=0;i<n.length();i++){
//             int val=n.charAt(i)-'0';
//             if(val>max){
//                 max=val;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int minPartitions(String n) {
        for(int i=9;i>0;i--){
            if(n.contains(String.valueOf(i))){
                return i;
            }
        }
        return 0;
    }
}