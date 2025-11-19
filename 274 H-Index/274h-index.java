class Solution {
    public int hIndex(int[] citations) {
        int n=1;
        boolean flag=false;
        while(!flag){
            int count=0;
            for(int x : citations){
                if(n<=x){
                    count++;
                }
            }
            if(count>=n){
                n++;
            }
            else{
                flag=!flag;
            }
        }
        return n-1;
    }
}