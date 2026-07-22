class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int[][] directions=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            int len=q.size();
            for(int i =  0;i<len;i++){
                 int[] arr = q.poll();
                    int r = arr[0];
                    int c =arr[1];
                for(int[] dir : directions){
                   int nr=r+dir[0];
                   int nc=c+dir[1];
                   if(nr<m && nr>=0 && nc<n && nc>=0 && grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                    fresh--;
                   }


                }
            }
            ans++;
        }
        if(fresh!=0){
            return -1;
        }
        return ans;
    }
}