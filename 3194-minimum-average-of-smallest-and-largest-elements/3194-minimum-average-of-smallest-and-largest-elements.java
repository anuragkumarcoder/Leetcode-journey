class Solution {
    public double minimumAverage(int[] nums) {
      int left=0;
      int right=nums.length-1;
      Arrays.sort(nums);
      double[] avg= new double[(right+1)/2];
      int i=0;
      while(right>left){
        avg[i++]=(nums[left++]+nums[right--])/2.0;
      } 
      double min=Double.MAX_VALUE;
      for(double x : avg) min=Math.min(min,x); 
      return min;
    }
}