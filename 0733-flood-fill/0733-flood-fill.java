class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color)
            dfs(image,sr,sc,color,image[sr][sc]);
        return image;
            
        
    }
    private void dfs(int[][] image,int r,int c,int color,int orig){
        int n=image.length;
        int m=image[0].length;
        if(r<0 || r>n-1 || c<0 || c>m-1 || image[r][c]!=orig){
            return;
        }
        image[r][c]=color;
        dfs(image,r+1,c,color,orig);
        dfs(image,r,c+1,color,orig);
        dfs(image,r,c-1,color,orig);
        dfs(image,r-1,c,color,orig);
    }
}