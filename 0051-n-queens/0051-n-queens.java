class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        boolean[][] flag=new boolean[n][n];
        List<String> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add("");
        }
        nQueens(ans,0,n,temp,flag); 
        return ans;
    }
    void nQueens(List<List<String>> ans,int row,int n,List<String> temp,boolean[][] flag){
        if(row==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isSafe(row,i,n,flag)){
                flag[row][i]=true;
                char[] rowChars = new char[n];
                Arrays.fill(rowChars, '.');
                rowChars[i]='Q';
                temp.set(row, new String(rowChars));
                nQueens(ans,row+1,n,temp,flag);
                flag[row][i]=false;
                temp.set(row,"");

            }
            
        }
    }
    boolean isSafe(int row,int col,int n,boolean[][] flag){
        for(int i=0;i<row;i++){
            if(flag[i][col]){
                return false;
            }
            

        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--  ){
            if(flag[i][j]==true){
                return false;
            }
        }
         for(int i=row-1,j=col+1;i>=0 && j<=n-1;i--,j++  ){
            if(flag[i][j]==true){
                return false;
            }
        }
        return true;
    }
}