class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int k = 0;
        
        while ((k * (k + 1)) / 2 <= n) {
            k++;
        }
        
        return k - 1; // The last valid k value
    }
}
