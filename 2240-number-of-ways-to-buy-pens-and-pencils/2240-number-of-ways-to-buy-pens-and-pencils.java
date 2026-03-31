class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long maxPens=total/cost1;
        long ans=0;
        for(int i=0;i<=maxPens;i++){
            long remain=(long)total-(long)(i*cost1);
            ans+=(remain/cost2)+1;

        }
        return ans;
    }
}