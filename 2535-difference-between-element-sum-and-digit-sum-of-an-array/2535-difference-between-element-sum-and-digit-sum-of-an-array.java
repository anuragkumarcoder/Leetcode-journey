class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int x : nums){
            sum+=x;
            while(x>0){
                digit+=x%10;
                x/=10;
            }
        }
        return Math.abs(sum-digit);
    }
}