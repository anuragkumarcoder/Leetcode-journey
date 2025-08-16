class Solution {
    public boolean hasAlternatingBits(int n) {
       int second=n&1;
       n=n>>1;
        while(n>0){
            int last=n&1;
            if(last==second){
                return false;
            }
            n=n>>1;
       second=last;
            
            
            
        }
        return true;
    }
}