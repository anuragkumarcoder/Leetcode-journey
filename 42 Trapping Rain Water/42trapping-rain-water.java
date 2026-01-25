class Solution {
    public int trap(int[] height) {
       int ans=0;
       int lmax=0;
       int rmax=0;
       int l=0;
       int r=height.length-1;
       while(l<r){
        lmax=Math.max(height[l],lmax);
        rmax=Math.max(height[r],rmax);
        if(lmax>rmax){
            ans+=(rmax-height[r]);
            r--;
        }
        else{
            ans+=(lmax-height[l]);
            l++;
        }
       }
       return ans;
    }
}