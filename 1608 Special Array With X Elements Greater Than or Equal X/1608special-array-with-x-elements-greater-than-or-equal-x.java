class Solution {
    public int specialArray(int[] nums) {
        int   max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];

            }
           
        }        
        for(int i=0;i<=max;i++){
                    int count=0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;   
    }
}