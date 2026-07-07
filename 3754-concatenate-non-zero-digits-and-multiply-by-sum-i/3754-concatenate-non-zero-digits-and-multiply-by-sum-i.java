class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        while(n>0){
            
            int x=n%10;
            if(x!=0){
                sb.append(String.valueOf(x));
                sum+=x;
            }
            n/=10; 
        }
        if (sb.length() == 0) {
            return 0;
        }
        sb.reverse();
        long y=Long.parseLong(sb.toString());
        return y*sum;

    }
}