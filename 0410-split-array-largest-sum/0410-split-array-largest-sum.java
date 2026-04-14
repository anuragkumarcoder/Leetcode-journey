class Solution {
    public int splitArray(int[] nums, int k) {
       int low=0;
       int high=0;
       for(int x : nums){
        low=Math.max(low,x);
        high+=x;
       } 
       int mid=0;
       while(low<high){
        int curr=0;
        int noOfSub=1;
        mid=low+(high-low)/2;
        for(int x : nums){
            if(curr+x>mid){
                noOfSub++;
                curr=x;
            }else{
                curr+=x;
            }
        }
        if(noOfSub>k){
            low=mid+1;
        }else{
            high=mid;
        }
       }
       return low;
    }
}