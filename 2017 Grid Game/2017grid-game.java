class Solution {
    public long gridGame(int[][] grid) {
        long topSum=0;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            topSum+=grid[0][i];
        }
        long min=Long.MAX_VALUE;
        long bottom=0;
        for(int i=0;i<n;i++){
            topSum-=grid[0][i];
            min=Math.min(min,Math.max(bottom,topSum));
            bottom+=grid[1][i];
        }
        return min;
    }
}