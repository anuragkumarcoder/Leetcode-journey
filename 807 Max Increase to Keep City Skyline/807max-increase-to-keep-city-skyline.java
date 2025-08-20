class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] maxr=new int[n];
        int[] maxc=new int[n];
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
             maxr[i]=Math.max(maxr[i],grid[i][j]);
             maxc[j]=Math.max(maxc[j],grid[i][j]);

           }
        }
        int total=0;
        for(int i=0;i<n;i++ ){
            for(int  j=0;j<n;j++){
                int all=Math.min(maxr[i],maxc[j]);
                total+=all-grid[i][j];
            }
        }
        return total;
    }
}