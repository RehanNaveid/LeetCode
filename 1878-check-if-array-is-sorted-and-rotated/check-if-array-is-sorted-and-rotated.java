class Solution {
    public boolean check(int[] nums) {
        int rotatepossible=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
            rotatepossible++;
        }
        if(nums[0]<nums[nums.length-1]){
            rotatepossible++;
        }
        if(rotatepossible>1)return false;

        return true;
    }
}