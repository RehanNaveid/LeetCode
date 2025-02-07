class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int no_of_bouquet=find_no_of_bouquets(bloomDay,mid,k);
            if(no_of_bouquet<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int find_no_of_bouquets(int bloomDay[],int day,int flowers){
        int c=0,no_of_bouquets=0;
        for(int i:bloomDay){
            if(i>day){
                no_of_bouquets+=c/flowers;
                c=0;
                continue;
            }
            c++;
        }
        no_of_bouquets+=c/flowers;
        return no_of_bouquets;
    }
}