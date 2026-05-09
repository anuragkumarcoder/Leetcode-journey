class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
       
        int m = grid.length;
        int n = grid[0].length;
        int numLayers = Math.min(m, n) / 2;

        for (int layer = 0; layer < numLayers; layer++) {
            int r1 = layer, c1 = layer;
            int r2 = m - 1 - layer, c2 = n - 1 - layer;

            int size = 2 * (r2 - r1) + 2 * (c2 - c1);
            int[] elements = new int[size];
            int idx = 0;

            for (int i = r1; i < r2; i++) elements[idx++] = grid[i][c1];   
            for (int j = c1; j < c2; j++) elements[idx++] = grid[r2][j];   
            for (int i = r2; i > r1; i--) elements[idx++] = grid[i][c2];   
            for (int j = c2; j > c1; j--) elements[idx++] = grid[r1][j];   

            int netK = k % size;
            int pointer = (size - netK) % size;
            for (int i = r1; i < r2; i++) grid[i][c1] = elements[pointer++ % size];
            for (int j = c1; j < c2; j++) grid[r2][j] = elements[pointer++ % size];
            for (int i = r2; i > r1; i--) grid[i][c2] = elements[pointer++ % size];
            for (int j = c2; j > c1; j--) grid[r1][j] = elements[pointer++ % size];
        }

        return grid;
    }
}