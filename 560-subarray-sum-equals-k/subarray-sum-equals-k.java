class Solution {
    public int subarraySum(int[] nums, int k) {
        if(k==0&&nums.length==1)return 0;
        int sum=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k)c++;       
            int rem=sum-k;
            if(map.containsKey(rem)){
                c+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);   
        }
        return c;
    }
}