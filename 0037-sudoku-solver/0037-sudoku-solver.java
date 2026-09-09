class Solution {
    public void solveSudoku(char[][] board) {
         helper(board,0,0);
    }
    boolean helper(char[][] board,int row,int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return helper(board,row+1,0);
        }
        if(board[row][col]!='.'){
             return helper(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
            char c=(char)(i+'0');
            if(isSafe(board,row,col,c)){
                board[row][col]=c;
                if(helper(board,row,col+1)){
                    return true;
                }
                board[row][col] = '.';
            }
            
        }
        return false;
    }
    private boolean isSafe(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false;
            if (board[row][i] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}