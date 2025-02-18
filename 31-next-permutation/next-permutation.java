class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        
        // Step 1: Find the first decreasing element from the right
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            // Step 2: If no such element exists, reverse the array
            reverse(nums, 0, n - 1);
        } else {
            // Step 3: Find the next larger element and swap
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
            // Step 4: Reverse the right portion
            reverse(nums, index + 1, n - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}  