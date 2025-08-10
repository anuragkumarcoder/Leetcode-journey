class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int startr=x;
        int endr=x+k-1;
        int startc=y;
        int endc=y+k-1;
        while(startr<endr){
            for(int i=startc;i<=endc;i++){
                int temp=grid[startr][i];
                grid[startr][i]=grid[endr][i];
                grid[endr][i]=temp;
            } 
            startr++;
            endr--;

        }
        
            
        
        return grid;
    }
}