class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(x%3==0){
                continue;
            }
            else{
                op++;
            }
        }
        return op;
    }
}