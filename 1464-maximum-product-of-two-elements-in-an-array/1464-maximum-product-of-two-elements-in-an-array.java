class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            int curr=0;
            for(int j=i+1;j<nums.length;j++){
                int prod=(nums[i]-1)*(nums[j]-1);
                curr=Math.max(prod,curr);
            }

            max=Math.max(curr,max);
        }
        return max;
    }
}