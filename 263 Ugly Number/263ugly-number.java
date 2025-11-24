class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
       int[] arr={2,3,5};
       for(int p : arr){
        while(n%p==0){
            n=n/p;
        }
       }
       return n==1;
    }
}