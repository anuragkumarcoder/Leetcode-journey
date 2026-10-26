class Solution {
    int ans=0;
    int m;
    int n;
    long sum=0;
    public int countIslands(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        boolean[][] visited=new boolean[m][n];      
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Queue<int[]> q=new LinkedList<>();
                if(grid[i][j]!=0 && !visited[i][j]){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                    sum=0;
                    helper(q,grid,i,j,visited,k);
                    
                }
            }
        }
        return ans;
    }
    public void helper(Queue<int[]> q,int[][] grid,int i,int j,boolean[][] visited,int k){
        while(!q.isEmpty()){
            int[] arr=q.poll();
            i=arr[0];
            j=arr[1];
            sum+=grid[arr[0]][arr[1]];
            if(i+1<m && grid[i+1][j]!=0 && !visited[i+1][j]) { 
                q.offer(new int[]{i+1,j});
                visited[i+1][j]=true;
            }
            if(j+1<n && grid[i][j+1]!=0 && !visited[i][j+1]) { 
                q.offer(new int[]{i,j+1});
                visited[i][j+1]=true;
            }
            if(j-1>=0 && grid[i][j-1]!=0 && !visited[i][j-1]) { 
                q.offer(new int[]{i,j-1});
                visited[i][j-1]=true;
            }
            if(i-1>=0 && grid[i-1][j]!=0 && !visited[i-1][j]) { 
                q.offer(new int[]{i-1,j});
                visited[i-1][j]=true;
            }
            // if(i+1<m && j+1<n && grid[i+1][j+1]!=0 && !visited[i+1][j+1]) { 
            //     q.offer(new int[]{i+1,j+1});
            //     visited[i+1][j+1]=true;
            // }
            // if(i+1<m && j-1>0 && grid[i+1][j-1]!=0 && !visited[i+1][j-1]) { 
            //     q.offer(new int[]{i+1,j-1});
            //     visited[i+1][j-1]=true;
            // }
            // if(i-1>0 && j+1<n && grid[i-1][j+1]!=0 && !visited[i-1][j+1]) { 
            //     q.offer(new int[]{i-1,j+1});
            //     visited[i-1][j+1]=true;
            // }
            // if(i-1>0 && j-1>0 && grid[i-1][j-1]!=0 && !visited[i-1][j-1]) { 
            //     q.offer(new int[]{i-1,j-1});
            //     visited[i-1][j-1]=true;
            // }
            
        }
        if(sum%k==0){
            ans++;
        }
    }
}