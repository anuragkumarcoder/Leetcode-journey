class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int diff[]=new int[1001];
        for(int i=0;i<trips.length;i++){
            int persons=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            diff[start]+=persons;
            diff[end]-=persons;

        }
        int sum=0;
        for(int i=0;i<1001;i++){
            if(capacity<sum){
                return false;
            }
            sum+=diff[i];
        }
        return true;
    }
}