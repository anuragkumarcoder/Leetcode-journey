class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int  k=Integer.bitCount(i);
                if(isprime(k)==true){
                    count++;
                }
        }
        return count;
    }
    static boolean isprime(int k){
        int pc=0;
        if(k<2) return false;
        for(int j=2;j<k;j++){
            if(k%j==0){
                pc++;
            }

        }
        if(pc==0){
            return true;
        }
        else{
        return false;
        }
    }
}