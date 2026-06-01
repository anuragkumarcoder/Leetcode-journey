class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int n=cost.length;
        for(int i=0;i<cost.length;i++){
            if((n-i)%3!=0){
                ans+=cost[i];
            }
        }
        return ans;
    }
}