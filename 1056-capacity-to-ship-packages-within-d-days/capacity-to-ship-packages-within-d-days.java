class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum;
        while(low<=high){
            int mid=(high+low)/2;//mid is weights per day
            int no_of_days=find_days(weights,mid);
            if(no_of_days>days){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int find_days(int[] weights,int mid){
        int count = 1;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                sum = weights[i];
                count++;
            }
        }
        return count;
    }
}