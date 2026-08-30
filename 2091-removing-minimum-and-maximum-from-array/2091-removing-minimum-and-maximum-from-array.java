class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int indmax=0;
        int indmin=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(max==nums[i]){
                indmax=i;
            }
            min=Math.min(min,nums[i]);
            if(min==nums[i]){
                indmin=i;
            }


        }
        int a = Math.max(indmax, indmin) + 1;                  
        int b = nums.length - Math.min(indmax, indmin);        
        int c = (Math.min(indmax, indmin) + 1) + (nums.length - Math.max(indmax, indmin)); 
        
        return Math.min(a, Math.min(b, c));
    }
}