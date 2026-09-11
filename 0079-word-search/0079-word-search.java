class Solution {
    public boolean exist(char[][] board, String word) {
         boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,word,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board,int row,int col, String word,int ind,boolean[][] visited ){
        if(ind==word.length()){
            return true;
        }
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(ind)||visited[row][col]) {
            return false;
        }
        boolean found=(word.charAt(ind)==board[row][col]);
        visited[row][col]=true;
        if(found){
            found=dfs(board,row+1,col,word,ind+1,visited);
        }
        if(!found){
            found=dfs(board,row-1,col,word,ind+1,visited);
        }
        if(!found){
            found=dfs(board,row,col+1,word,ind+1,visited);
        }
        if(!found){
            found=dfs(board,row,col-1,word,ind+1,visited);
        }
        visited[row][col]=false;
        return found;
        
    }
}
















