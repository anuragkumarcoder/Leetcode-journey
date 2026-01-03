class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y=x;
        int sum=0;
        while(y>0){
            int z=y%10;
            sum+=z;
            y/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}