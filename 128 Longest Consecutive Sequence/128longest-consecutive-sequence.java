class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int length=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                length++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                
                max=Math.max(max,length);
                length=1;
            }

        }
        max=Math.max(max,length);
        return max;
    }
}