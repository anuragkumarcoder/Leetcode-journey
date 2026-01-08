class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==nums[i-1]%2){
                flag=false;
                break;
            }
        }
        return flag;
    }
}