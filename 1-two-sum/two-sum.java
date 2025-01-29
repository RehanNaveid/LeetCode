class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(hp.containsKey(rem)){
                res[0]=i;
                res[1]=hp.get(rem);
                break;
            }
            else{
                hp.put(nums[i],i);
            }
        }
        return res;
    }
}