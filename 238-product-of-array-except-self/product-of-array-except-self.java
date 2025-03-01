class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        // int sufix[]=new int[n];
        int res[]=new int[n];
        prefix[0]=1;//as 1st element prefix does not exist
        int sufix=1;//as last element prefix does not exist
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        // for(int i=n-2;i>=0;i--){
        //     sufix[i]=sufix[i+1]*nums[i+1];
        // }
        for(int i=n-1;i>=0;i--){
            res[i]=prefix[i]*sufix;
            sufix*=nums[i];
        }
        return res;
    }
}