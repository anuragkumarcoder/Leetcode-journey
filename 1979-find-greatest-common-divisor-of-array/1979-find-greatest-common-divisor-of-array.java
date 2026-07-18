class Solution {
    public int findGCD(int[] nums) {
        int min=10001;
        int max=0;
        for(int x : nums){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        int ans=1;
        for(int i=1;i<=min;i++){
            if(max%i == 0 && min%i==0){
                ans=i;
            }
        }
        return ans;
    }
}