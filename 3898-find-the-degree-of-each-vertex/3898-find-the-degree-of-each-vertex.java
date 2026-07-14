class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] arr =new int[n];
        for(int i = 0;i<n ;i++){
            int j = matrix[i].length;
            int sum=0;
            for(int k = 0;k<j;k++){
                sum+=matrix[i][k];   
            }
            arr[i]=sum;
        }
        return arr;
    }
}