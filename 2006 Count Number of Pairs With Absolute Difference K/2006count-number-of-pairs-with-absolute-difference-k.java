class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            for(int j=i;j<n;j++){
                if(j!=i){
                    if(Math.abs(nums[j]-x)==k){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}