class Solution {
    public long countCommas(long n) {
        long ans=0;
        long mul=1000;
        while(n>=mul){
            ans+=n-mul+1;
            mul*=1000;

        }
        return ans;
    }
}