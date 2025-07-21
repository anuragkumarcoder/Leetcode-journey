class Solution {
    public int[] sumZero(int n) {
       int[] arr=new int[n];
        int index=0;
       for(int i=1;i<=(n)/2;i++){
        
        arr[index++]=-i;
        arr[index++]=i;
       } 
       if(n%2!=0){
            arr[n-1]=0;
        }
       return arr;
    }
}