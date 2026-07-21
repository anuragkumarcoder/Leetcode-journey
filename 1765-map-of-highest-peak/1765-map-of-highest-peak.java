class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (isWater[r][c] == 1) {
                    height[r][c] = 0;
                    queue.offer(new int[]{r, c});
                } else {
                    height[r][c] = -1;
                }
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c=cur[1];
            for(int[] dir : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr<m && nr>=0 && nc<n && nc>=0 && height[nr][nc]== -1 ){
                    height[nr][nc]= height[r][c]+1;
                    queue.offer(new int[]{nr,nc});
                }
                
            }
        }
        return height;
        
    }
}