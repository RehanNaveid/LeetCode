class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=Integer.MIN_VALUE;
        int waterlvl;
        while(i<j){
            waterlvl=(j-i)*Math.min(height[i],height[j]);
            max=Math.max(max,waterlvl);
            if(height[i]>height[j]){
                j--;
            }
            else{
            i++;
            }
        }
        return max;
    }
}