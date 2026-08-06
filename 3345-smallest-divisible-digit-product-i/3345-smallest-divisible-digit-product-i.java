class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int x = 1;
            int z=n;
            while(z>0){
            int y=z%10;
            if(y==0){
                return n;
            }
            x*=y;
            z/=10;
        
            }
            if(x%t==0){
                return n;
            } 
            n++;
        
        }
        
    }
}