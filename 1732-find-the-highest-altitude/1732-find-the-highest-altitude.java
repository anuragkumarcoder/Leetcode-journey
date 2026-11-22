class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n+1];
       int ind=0;
        for(int i=1;i<(n+1);i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=0;
        for(int x : arr){
            max=Math.max(x,max);
        }
        return max;
    }
}