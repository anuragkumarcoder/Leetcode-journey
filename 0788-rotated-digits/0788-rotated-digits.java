class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isGood(i)){
                count++;
            }
        }
        return count;
    }
    private boolean isGood(int i){
        boolean flag=false;
        while(i>0){
            int x=i%10;
            if(x==3 || x==4 || x==7){
                return false;
            }
            else if(x==6 || x==9 || x==5 || x==2){
                flag=true;
            }
            i/=10;
        }
        return flag;

    }
}