class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0;
        int curr=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>curr){
                ans+=2*i;
                curr=capacity;
                
            }
            
                curr-=plants[i];
                ans++;

            
            
        }
        return ans;
    }
}