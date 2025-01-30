class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int start=0;
        int end=nums.length-1;
        List<List<Integer>> result=new ArrayList<>();
        permutation(nums,start,end,result);
        return result;
    }
    public void permutation(int nums[],int start,int end,List<List<Integer>> result){
        if(start==end){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            result.add(list);
        }
        for(int i=start;i<=end;i++){
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            permutation(nums,start+1,end,result);
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
    }

}