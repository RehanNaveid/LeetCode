class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        int ans[]=new int[nums.length];
        for(int j=0;j<nums.length;j++){
           if(nums[j]>0){
                ans[pos]=nums[j];
                pos+=2;
           }
           else{
                ans[neg]=nums[j];
                neg+=2;
           }
        }
        return ans;
    }  
}