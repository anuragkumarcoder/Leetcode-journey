class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int n=colors.length;
       for(int i =0;i<n;i++){
        int curr=0;
            for(int j=i+1;j<n;j++){
                if(colors[i]!=colors[j]){
                    curr=j-i;
                }
            }
            ans=Math.max(curr,ans);

       } 
       return ans;
    }
}