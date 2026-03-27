class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
       int[] diff=new int[n];
       for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            diff[start]+=1;
            if(end+1<n){
                diff[end+1]-=1;
            }
       }
       int diffsum=0;
       for(int j=0;j<n;j++){
            diffsum+=diff[j];
            if(diffsum<nums[j]) return false;
       }
       return true;
       
    }
}