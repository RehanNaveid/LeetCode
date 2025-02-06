class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length]; // Memoization array
        return func(nums, 0, dp);
    }

    public boolean func(int[] nums, int ind, Boolean[] dp) {
        if (ind >= nums.length - 1) {
            return true; // Reached the last index
        }
        if (dp[ind] != null) {
            return dp[ind]; // Return memoized result
        }

        int jump = nums[ind];
        for (int i = 1; i <= jump; i++) {
            if (func(nums, ind + i, dp)) {
                return dp[ind] = true; // Memoize and return
            }
        }
        return dp[ind] = false; // Memoize failure case
    }
}
