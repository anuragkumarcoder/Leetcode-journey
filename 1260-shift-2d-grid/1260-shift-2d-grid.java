class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        k = k % total;        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>());
        }

        for (int i = 0; i < total; i++) {
            int originalIdx = (i - k + total) % total;
            
            int originalRow = originalIdx / n;
            int originalCol = originalIdx % n;
            
            int currentRow = i / n;
            result.get(currentRow).add(grid[originalRow][originalCol]);
        }
        
        return result;
    }
}