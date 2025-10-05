class Solution {
    public int reverse(int x) {
        int ans=0;
        int abs=Math.abs(x);
        while(abs>0){
            int k=abs%10;
            
            if(ans>(Integer.MAX_VALUE-k)/10){
                return 0;
            }
            else{
                ans=ans*10+k;
            }
            
            abs=abs/10;
            

        }
        if(x<0){
            return -1*ans;
        }
        else{
            return ans;
        }
    }
}