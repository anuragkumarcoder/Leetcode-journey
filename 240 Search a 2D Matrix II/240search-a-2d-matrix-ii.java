class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            int x=matrix[row][col];
            if(x==target) return true;
            else if(x>target) row--;
            else{
                col++;
            }
        }
        return false;
    }
}