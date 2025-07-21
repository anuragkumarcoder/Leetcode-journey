class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
                
                    sum+=mat[i][i];

                
                
            }
            for(int k=0;k<mat.length;k++){
                if(k!=mat.length-1-k){
                    sum+=mat[k][mat.length-1-k];
                }
            }
        return sum;
        
    }
}