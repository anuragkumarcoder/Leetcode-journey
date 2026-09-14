class Solution {
    int max=0;
    int area=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    area=0;
                    helper(visited,grid,n,m,i,j);
                    max=Math.max(max,area);
                }
            }
        }
        return max;

    }
    void helper(boolean[][] visited,int[][] grid,int n,int m,int row,int col){
        
        if(row>=n || row<0 || col>=m || col<0 || visited[row][col]){
            return;
        }
        if(grid[row][col]==0){
            
            return;
        }
        visited[row][col]=true;
        area++;
        helper(visited,grid,n,m,row+1,col);
        helper(visited,grid,n,m,row-1,col);
        helper(visited,grid,n,m,row,col+1);
        helper(visited,grid,n,m,row,col-1);

        

    }
    
}