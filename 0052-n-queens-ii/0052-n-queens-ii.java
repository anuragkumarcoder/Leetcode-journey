class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        boolean[][] flag=new boolean[n][n];
        helper(0,n,flag);
        return ans;
    }
    void helper(int row,int n,boolean[][] flag){
        if(row==n){
            ans++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(flag,n,i,row)){
                flag[row][i]=true;
                helper(row+1,n,flag);
                flag[row][i]=false;
            }

            
        }
        
        

    }
    boolean isSafe(boolean[][] flag,int n,int col,int row){
            for(int i=0;i<row;i++){
                if(flag[i][col]){
                    return false;
                }
                
            }
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(flag[i][j]){
                    return false;
                }
            }
             for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
                if(flag[i][j]){
                    return false;
                }
            }
            return true;
     }
}













