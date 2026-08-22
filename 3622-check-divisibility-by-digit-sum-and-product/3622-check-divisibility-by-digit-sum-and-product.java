class Solution {
    public boolean checkDivisibility(int n) {
        int x=0;
        int y=1;
        int a=n;
        while(n>0){
            int z=n%10;
            x+=z;
            y*=z;
            n/=10;
        }
        return a%(x+y)==0;
    }
}