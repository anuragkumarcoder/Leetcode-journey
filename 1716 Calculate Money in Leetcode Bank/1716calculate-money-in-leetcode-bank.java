class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int day=1;
        int mon=1;
        for(int i=0;i<n;i++){
            if((i)%7==0 && i>0){
                mon++;
                day=mon;
            }
            sum+=day;
            day++;
        }
        return sum;


    }
    
     
    
}