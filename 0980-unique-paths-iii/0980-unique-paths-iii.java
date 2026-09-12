class Solution {
    int ans=0;
    int i=0,j=0;
    int count=0;
    public int uniquePathsIII(int[][] grid) {
        boolean[][] flag=new boolean[grid.length][grid[0].length];
        boolean f=false;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    f=true;
                    break;
                }
            }
            if(f){
                break;
            }
            
        }
         for(int x=0;x<grid.length;x++){
            for(int y=0;y<grid[0].length;y++){
                if(grid[x][y]!=-1){
                    count++;
                }
            }
        }
        helper(flag,grid,i,j,0);
        return ans;
    }
    void helper(boolean[][] flag,int[][] grid,int row,int col,int curr){
       
      
        if (row >= grid.length || col >= grid[0].length ||row < 0 || col < 0||flag[row][col]){
            return;
        }
         
          if(grid[row][col]==-1){
            return;
        }
                                                           
        flag[row][col]=true;
        curr++;
         if(grid[row][col]==2){
            if(curr==count){
                ans++;
            }
            flag[row][col]=false;
            return;
        }
        helper(flag,grid,row+1,col,curr);
         helper(flag,grid,row,col+1,curr);
         helper(flag,grid,row-1,col,curr);
        helper(flag,grid,row,col-1,curr);
       flag[row][col]=false; 
       
    
    }
}