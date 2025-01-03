class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for(int itr=1;itr<arr.length-1;itr++){
            if(arr[itr]>arr[itr-1]&&arr[itr]>arr[itr+1]){
                int ind=itr;
                int length=1;
                while(ind>0 && arr[ind]>arr[ind-1]){
                    length++;
                    ind--;
                }
                ind=itr;
                while(ind<arr.length-1 && arr[ind]>arr[ind+1]){
                    length++;
                    ind++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}