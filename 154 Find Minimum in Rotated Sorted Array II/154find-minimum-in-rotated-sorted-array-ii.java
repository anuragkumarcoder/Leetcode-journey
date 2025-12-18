class Solution {
    public int findMin(int[] nums) {
        int m=5001;
        for(int i=0;i<nums.length;i++){
            m=Math.min(m,nums[i]);
        }
        return m;
    }
}