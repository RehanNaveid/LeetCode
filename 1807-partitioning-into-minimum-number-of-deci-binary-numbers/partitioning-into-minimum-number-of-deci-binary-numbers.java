class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int val=n.charAt(i)-'0';
            if(val==9){
                return 9;
            }
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}