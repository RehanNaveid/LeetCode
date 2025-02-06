class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                int value=map.getOrDefault(prod,0);
                map.put(prod,value+1);
            }
        }
        int result=0;
        for(int count:map.values()){
            if(count>1){
                result+=8*(count*(count-1)/2);
            }
        }
        return result;

    }
}