class Solution {
    public String largestNumber(int[] nums) {
        int len=nums.length;
        int i,j;
        String[] str=new String[len];
        for(i=0;i<len;i++){
            str[i]=String.valueOf(nums[i]);
        }
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                String con1=str[i]+str[j];
                String con2=str[j]+str[i];
                if(con1.compareTo(con2)<0){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        String ans="";
        for(i=0;i<len;i++){
            ans=ans+str[i];
        }
        if (ans.charAt(0) == '0') {
            return "0";
        }
        return ans;
    }
}