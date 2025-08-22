class Solution {
    public int minOperations(int[] nums, int k) {
        int x=k;
        for(int i=0;i<nums.length;i++){
            x^=nums[i];
        }
        return Integer.bitCount(x);
    }
}