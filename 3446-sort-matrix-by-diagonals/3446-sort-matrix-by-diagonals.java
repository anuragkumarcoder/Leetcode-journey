class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        int n = grid.length;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                final int diag=i-j;
                if(!map.containsKey(diag)){
                     
                    map.put(diag,new PriorityQueue<>((a,b) -> diag >= 0 ? b-a : a-b));
                }
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                map.get(i-j).offer(grid[i][j]);
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
               grid[i][j]=map.get(i-j).poll();
            }
        }
        return grid;

    }
}