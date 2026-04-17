class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=1;
        long min=time[0];
        for(int x : time){
            min=Math.min(min,x);
        }
        long high=min*totalTrips;
        long res=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long ans=0;
            for(int x : time){
                ans+=mid/x;
            }
            if(ans>=totalTrips){
                res=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return res;
    }
}