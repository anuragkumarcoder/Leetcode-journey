class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int max=0;
        while(left<right){
            int curr=nums[left]+nums[right];
            max=Math.max(curr,max);
            left++;
            right--;
        } 
        return max;  
    }
}