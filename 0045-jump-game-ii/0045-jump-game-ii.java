class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int jump=0;
        int far=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            far=Math.max(i+nums[i],far);
            if(i==curr){
                jump++;
                curr=far;
            }
            if(curr==nums.length-1){
                break;
            }
        }
        return jump;
    }
}