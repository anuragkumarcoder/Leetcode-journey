class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans=special[0]-bottom;
        int n=special.length;
        int curr=0;
        for(int i=1;i<n;i++){
            curr=special[i]-special[i-1]-1;
            ans=Math.max(ans,curr);
        }   
        return Math.max(ans,top-special[n-1]);
    }
}