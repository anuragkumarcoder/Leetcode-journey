class Solution {
    int curr=0;
    int ans=0;
    int left,right=0;
    public int longestMountain(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                 left=i;
                 right=i;
                while(left>0 && arr[left]>arr[left-1] ){
                    left--;
                }
                while( right<arr.length-1 && arr[right]>arr[right+1]){
                    right++;
                }
                curr=right-left+1;
                ans=Math.max(curr,ans);
                 i=right;
            }
           
        }
        return ans;
    }
}