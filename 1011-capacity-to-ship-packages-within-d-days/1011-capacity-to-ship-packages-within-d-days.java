class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0;
        int max=0;
        for(int x : weights){
            min=Math.max(min,x);
            max+=x;
        }
        int mid=0;
        while(min<max){
            int sum=0;
            mid=min+(max-min)/2;
            int day=1;
            for(int x : weights){
                if(sum+x>mid){
                    sum=x;
                    day++;
                }
                else{
                    sum+=x;
                }
                
            }
            if(day>days){
                min=mid+1;
            }
            else{
                max=mid;
            }
            
        }
        return max;
    }
}