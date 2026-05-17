class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0){
            return true;
        }
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{start,arr[start]});
        boolean[] visited=new boolean[arr.length];
        visited[start]=true;

       while(!q.isEmpty()){
            int[] x=q.poll();
            int z=x[0]+x[1];
            int y=x[0]-x[1];
            if(z<arr.length && !visited[z]){
                q.offer(new int[]{z,arr[z]});
                visited[z]=true;
                if(arr[z]==0){
                    return true;
                }  
            }
            if(y>=0 && !visited[y]){
                q.offer(new int[]{y,arr[y]});
                visited[y]=true;
                if(arr[y]==0){
                    return true;
                }
            }
        }  
        return false;
    }
}