class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> diagonals=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int id=i-j;
                diagonals.putIfAbsent(id,new PriorityQueue<>());
                diagonals.get(id).offer(mat[i][j]);

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int id = i - j;
                mat[i][j] = diagonals.get(id).poll();
            }
        }
        return mat;    
    }
}