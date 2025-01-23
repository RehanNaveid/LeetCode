class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // find region with border 0
        for (int i = 0; i < rows; i++) {
            for(int j=0;j < cols;j++){
                if((i==0||j==0||i==rows-1||j==cols-1)&&(board[i][j]=='O'))
                markEdgeConnected(board, rows, cols, i, j);
            }
            // if (board[i][0] == 'O') 
            // if (board[i][cols - 1] == 'O') markEdgeConnected(board, rows, cols, i, cols - 1);
        }
        // for (int j = 0; j < cols; j++) {
        //     if (board[0][j] == 'O') markEdgeConnected(board, rows, cols, 0, j);
        //     if (board[rows - 1][j] == 'O') markEdgeConnected(board, rows, cols, rows - 1, j);
        // }

        // Step 2: Replace all remaining 'O's with 'X' and all 'R's back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'R') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void markEdgeConnected(char[][] board, int rows, int cols, int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'R'; // Mark as visited (temporary)
        markEdgeConnected(board, rows, cols, i - 1, j); // Top
        markEdgeConnected(board, rows, cols, i + 1, j); // Bottom
        markEdgeConnected(board, rows, cols, i, j - 1); // Left
        markEdgeConnected(board, rows, cols, i, j + 1); // Right
    }
}
