class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            if(nums[i]!=0)i++;
                
        }
    }
}