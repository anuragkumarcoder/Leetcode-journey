class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=-1;
        long min=Integer.MAX_VALUE;
        for(int x : nums){
            min=Math.min(x,min);
            max=Math.max(x,max);
        } 
        long ans=(max-min)*k;
        return ans;
    }
}