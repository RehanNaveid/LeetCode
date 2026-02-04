class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int ans=0;
        long k=0;
        while(low<=high){
            int mid=(low+high)/2;
            k=hours(piles,mid);
            // System.out.println(mid+" "+k);
            if(k>h){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }

    public long hours(int[] piles,int k){
        long h=0;
        for(int pile:piles){
            h += (pile + k - 1) / k;
        }
        return h;
    }
}