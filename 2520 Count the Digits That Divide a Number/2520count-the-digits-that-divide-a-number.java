class Solution {
    public int countDigits(int num) {
        int x=num;
        int sum=0;
        while(x>0){
            int y=x%10;
            x=x/10;
            if(num%y==0)
                sum++;
        }
        return sum;
    }
}