class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int minInd=nums.length-k;
        if (k == 0) {
            return nums.length;
        }
        if (nums.length <= k) {
            return 0;
        }
        int MaxV=nums[minInd];
        for(int i : nums){
            if(i<MaxV){
                count++;
            }
        }
        return count;
    }
}