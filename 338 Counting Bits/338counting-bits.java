class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int nums=i;
            int count=0;
            while(nums>0){
                 if((nums&1)==1){
                    count++;
                    nums=nums>>1;
                }
                else{
                    nums=nums>>1;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}