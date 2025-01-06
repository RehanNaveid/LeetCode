class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length; // Step 1: Total number of students
        int k = 0; // Step 2: Initialize group count to 0

        // Step 3: Iterate to find the maximum number of groups
        while ((k * (k + 1)) / 2 <= n) {
            // Visualize current group count and sum:
            // Group 1: 1 student
            // Group 2: 2 students
            // Group 3: 3 students
            // ... continue until the sum exceeds the total number of students
            k++; // Move to the next group
        }

        // Step 4: Return the largest valid group count
        return k - 1; 
    }
}
