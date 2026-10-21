class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r=rowSum.length;
        int c=colSum.length;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int curr=Math.min(rowSum[i],colSum[j]);
                arr[i][j]=curr;
                rowSum[i]-=curr;
                colSum[j]-=curr;
            }
        }
        return arr;
    }
}