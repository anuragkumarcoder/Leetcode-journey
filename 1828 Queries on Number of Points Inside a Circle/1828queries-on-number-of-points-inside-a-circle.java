class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int m=points.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2];
            int count=0;
            for(int j=0;j<m;j++){
                int a=points[j][0];
                int b=points[j][1];
                if((x-a)*(x-a)+(y-b)*(y-b)<=r*r){
                    count++;
                }
                
            }
            ans[i]=count;
        }
        return ans;
    }
}