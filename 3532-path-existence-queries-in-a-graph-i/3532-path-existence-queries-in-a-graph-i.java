class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int x = queries.length;
        int id=0;
        int[] g = new int[n];
        for(int i = 1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                id++;
            }
            g[i]=id;
        }

        boolean[] flag = new boolean[x];
        for(int i = 0;i<x;i++){
            if(g[queries[i][0]]==g[queries[i][1]]){
                flag[i]=true;
            }else{
                flag[i]=false;
            }
        }
        return flag;
    }
}