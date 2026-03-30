class Solution {
    public long[] sumOfThree(long num) {
        long[] arr=new long[3];
        if(num%3!=0) return new long[0];

        else{
            arr[1]=num/3;
            arr[0]=arr[1]-1;
            arr[2]=arr[1]+1;
        }
        return arr;
    }
}