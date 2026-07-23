class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;
        Queue<int[]> q =new LinkedList<>();
        q.offer(entrance);
        boolean[][] visited = new boolean[n][m];
        visited[entrance[0]][entrance[1]]=true;
        int[][] directions=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        int ans=0;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i =0;i<len;i++){
                int[] curr=q.poll();
                int r = curr[0];
                int c= curr[1];
                if ((r != entrance[0] || c != entrance[1]) && (r == 0 || r == n - 1 || c == 0 || c == m - 1)) {
                    return ans;
                }
            
                for(int[] dir : directions){
                    int nr = r+dir[0];
                    int nc = c + dir[1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && maze[nr][nc]=='.' && !visited[nr][nc]){
                        q.offer(new int[]{nr,nc});
                        visited[nr][nc]=true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}