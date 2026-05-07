class Solution {
    public int[] maxValue(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        int[] ans=new int[n];
        int min=0;
        int max=nums[0];
        int ind=n-1;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            pre[i]=max;
            
        }
        min=nums[n-1];
        suf[n-1]=min;
        for(int i=n-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            suf[i]=min;
        }
        ans[n-1]=pre[n-1];
        for(int i=n-2;i>=0;i--){
            if(pre[i]>suf[i+1]){
                ans[i]=ans[i+1];
            }else{
                ans[i]=pre[i];
            }
        }
        return ans;
    }
}