class Solution {
    public boolean isValidSudoku(char[][] board) {
        return helper(board,0,0);
    }
    boolean helper(char[][] board,int row,int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return helper(board,row+1,0);
        }
        if(board[row][col]!='.'){
            char c = board[row][col];
            board[row][col] = '.';
            if(!isSafe(board, row, col, c)) {
                board[row][col] = c;
                return false;
            }
            board[row][col] = c;
        }
        return helper(board,row,col+1);
    }
    boolean isSafe(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false;
            if (board[row][i] == c) return false; 
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}