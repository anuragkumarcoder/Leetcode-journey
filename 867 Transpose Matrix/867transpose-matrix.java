class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix[0].length;
        int c=matrix.length;
        int[][] ans =new int[r][c];
      for(int i=0;i<r;i++){        
        for(int j=0;j<c;j++){
            ans[i][j]=matrix[j][i];
             
        }
      } 
      return ans; 
    }
}