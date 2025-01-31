class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,nums.length-1);
        }
        else{
            for(int i=nums.length-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            reverse(nums,idx+1,nums.length-1);
        }
        
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}