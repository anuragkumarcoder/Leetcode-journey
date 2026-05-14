class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int x=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=++x){
                return false;
            }
        }
        return nums[nums.length-1]==x;
    }
}