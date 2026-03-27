class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int diff[]=new int[n];
        for(int i=0;i<bookings.length;i++){
            diff[bookings[i][0]-1]+=bookings[i][2];
            if(n>bookings[i][1]){
                diff[bookings[i][1]]-=bookings[i][2];
            }
        }
        int ans[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=diff[i];
            ans[i]=sum;
        }
        return ans;
    }
}