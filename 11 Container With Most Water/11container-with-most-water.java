class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        
        while(left<right){
            int k=Math.min(height[left],height[right])*(right-left);
            if(k>max) max=k;
            int min=Math.min(height[left],height[right]);
            if(min==height[left]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return max;
    }
}