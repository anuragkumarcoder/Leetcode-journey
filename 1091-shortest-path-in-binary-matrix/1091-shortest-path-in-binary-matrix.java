class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        boolean[][] visited=new boolean[n][n];
        Queue<int[]> q=new LinkedList<>();
        if(grid[0][0]==0){
            q.offer(new int[]{0,0});
        }else{
            return -1;
        }
        visited[0][0]=true;
        int ans=0;
        while(!q.isEmpty()){
            int len=q.size();
            ans++;
            for(int i=0;i<len;i++){
                int[] arr=q.poll();
                int r=arr[0];
                int c=arr[1];
                if(r==n-1 && c==n-1) return ans;
                if(r+1<n && !visited[r+1][c] && grid[r+1][c]==0){
                    q.offer(new int[]{r+1,c});
                    visited[r+1][c]=true;
                }
                if(r-1>=0 && !visited[r-1][c] && grid[r-1][c]==0){
                    visited[r-1][c]=true;
                    q.offer(new int[]{r-1,c});
                }
                if(c+1<n && !visited[r][c+1] && grid[r][c+1]==0){
                    q.offer(new int[]{r,c+1});
                    visited[r][c+1]=true;
                }
                if(c-1>=0 && !visited[r][c-1] && grid[r][c-1]==0){
                    visited[r][c-1]=true;
                    q.offer(new int[]{r,c-1});
                }
                if(r+1<n && c+1<n && !visited[r+1][c+1] && grid[r+1][c+1]==0){
                    q.offer(new int[]{r+1,c+1});
                }
                if(r+1<n && c-1>=0 && !visited[r+1][c-1] && grid[r+1][c-1]==0){
                    q.offer(new int[]{r+1,c-1});
                }
                if(r-1>=0 && c-1>=0 && !visited[r-1][c-1] && grid[r-1][c-1]==0){
                    visited[r-1][c-1]=true;
                    q.offer(new int[]{r-1,c-1});
                }
                if(r-1>=0 && c+1<n && !visited[r-1][c+1] && grid[r-1][c+1]==0){
                    visited[r-1][c+1]=true;
                    q.offer(new int[]{r-1,c+1});
                }
            }

        }
        return -1;
    }
}