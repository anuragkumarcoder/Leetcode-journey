class Solution {
    public int missingNumber(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
        n^=nums[i];
        n^=i;
        }
        n=n^nums.length;
        return n;
    }
}