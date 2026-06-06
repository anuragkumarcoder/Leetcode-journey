class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] visited=new boolean[n][m];
        int[][] ans=new int[n][m];
        int step=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                    ans[i][j]=step;
                }else{
                    ans[i][j]=-1;
                }
            }
        }
        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int x=q.size();
            
            for(int i=0;i<x;i++){
                int[] arr=q.poll();
                for(int j=0;j<4;j++){
                    int r=arr[0]+dir[j][0];
                    int c=arr[1]+dir[j][1];

                    if(r<n && r>=0 && c<m && c>=0 && !visited[r][c] && mat[r][c]==1){
                        
                        visited[r][c]=true;
                        ans[r][c]=arr[2]+1;
                        q.offer(new int[]{r,c,ans[r][c]});
                    }

                }
                
            }
        }
        return ans;

    }
}