class Solution {
public:
    int findmaxi(vector<int>&piles){
        int maxi=INT_MIN;
        for(int i=0;i<piles.size();i++){
            maxi=max(maxi,piles[i]);
        }
        return maxi;
    }
    long long totalhours(vector<int>& piles,int mid){
        long long th=0;
        int n=piles.size();
        for(int i=0;i<n;i++){
            th+=ceil((double)piles[i] /(double)mid);
        }
        return th;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
        int low=1;
        int high=findmaxi(piles);
        while(low<=high){
            int mid= (high + low) / 2;
            long long t_h=totalhours(piles,mid);
            if(t_h<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            } 
        }
        return low;

    }

};