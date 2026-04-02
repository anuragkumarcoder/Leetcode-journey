class Solution {
    public int minFlips(int[][] grid) {
        int ans1=0;
        int ans2=0;
       for(int i=0;i<grid.length;i++){
        int left=0;
        int right=grid[i].length-1;
        while(left<right){
            if(grid[i][left]!=grid[i][right]){
                ans1++;
            }
            left++;
            right--;
        }
       } 
       for(int i=0;i<grid[0].length;i++){
        int left=0;
        int right=grid.length-1;
        while(left<right){
            if(grid[left][i]!=grid[right][i]){
                ans2++;
            }
            left++;
            right--;
        }
       } 

       return Math.min(ans1,ans2);
    }
}