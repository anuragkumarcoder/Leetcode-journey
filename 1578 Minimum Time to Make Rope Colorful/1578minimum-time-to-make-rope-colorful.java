class Solution {
    public int minCost(String colors, int[] neededTime) {
        int l=0;
        int r=1;
        int ans=0;
        while(r<colors.length()){
            if(colors.charAt(l)==colors.charAt(r)){
                if(neededTime[l]>neededTime[r]){
                    ans+=neededTime[r];
                
                    r++;
                    
                }
                else{
                    ans+=neededTime[l];
                    l=r;
                    r++;
                    
                }
            }
            else{
                l=r;
                r++;
            }
        }
        return ans;
    }
}