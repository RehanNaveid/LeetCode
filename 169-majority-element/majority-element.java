class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=hp.getOrDefault(nums[i],0);
            hp.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer>it: hp.entrySet()){
            if(it.getValue()>(nums.length/2))
            return it.getKey();
        }
        return 0;

    }
}