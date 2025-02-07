class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int range=findMax(piles);
        int low=1,high=range;//{1,2,3,4,5,6,7,8,9,10,11}
        while(low<=high){
            int mid=(low+high)/2;
            int totalhours=find_total_hours(piles,mid);
            if(totalhours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int find_total_hours(int piles[],int bananas_per_hour){
        int totalhours=0;
        for(int i:piles){
            totalhours+=Math.ceil((double)i/(double)bananas_per_hour);
        }
        return totalhours;
    }
    public int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }

}