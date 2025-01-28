class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int rows = grid.length;        // Number of rows
        int cols = grid[0].length;     // Number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {  // Only start from water cells
                    maxFish = Math.max(maxFish, func(grid, i, j, rows, cols));
                }
            }
        }

        return maxFish;
    }

    private int func(int[][] grid, int row, int col, int rows, int cols) {
        // Base case: Out of bounds or visited cell
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] <= 0) {
            return 0;
        }

        int fish = grid[row][col]; // Catch fish at the current cell
        grid[row][col] = -1;       // Mark the cell as visited

        // Explore all 4 directions
        fish += func(grid, row + 1, col, rows, cols); // Down
        fish += func(grid, row - 1, col, rows, cols); // Up
        fish += func(grid, row, col + 1, rows, cols); // Right
        fish += func(grid, row, col - 1, rows, cols); // Left

        return fish; // Return the total fish caught from this region
    }
}
