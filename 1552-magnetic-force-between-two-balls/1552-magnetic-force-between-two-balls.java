class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int ans=0;
        int high=position[n-1]-position[0];
        int mid=0;
        while(high>=low){
            mid=low+(high-low)/2;
            int count=1;
            int lastpos=position[0];
            for(int i=1;i<n;i++){
                if(position[i]-lastpos>=mid){
                    count++;
                    lastpos=position[i];
                }
            }
            if(count>=m){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;

    }
}