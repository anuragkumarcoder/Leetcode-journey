class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }int high=0;
        int low=1;
        for(int x : bloomDay){
            high=Math.max(high,x);
        }
        int mid=0;
        while(high>low){
            mid=low+(high-low)/2;
            int bouq=0;
            int flowers=0;
            for(int x : bloomDay){
                if(x<=mid){
                    flowers++;
                    if(flowers==k){
                        bouq++;
                        flowers=0;
                    }
                }else{
                    flowers=0;
                }
            }
            if(bouq>=m){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}