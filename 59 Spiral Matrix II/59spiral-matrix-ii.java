class Solution {
    public int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int up=0;
        int down=n-1;
        int count=1;
        int[][] matrix=new int[n][n];
        while(left<=right && up<=down){
            for(int i=left;i<=right;i++){
                matrix[up][i]=count++;
            }
            up++;
            for(int i=up;i<=down;i++){
                matrix[i][right]=count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[down][i]=count++;
            }
            down--;
            for(int i=down;i>=up;i--){
                matrix[i][left]=count++;
            }
            left++;
        }
        return matrix;
    }
}