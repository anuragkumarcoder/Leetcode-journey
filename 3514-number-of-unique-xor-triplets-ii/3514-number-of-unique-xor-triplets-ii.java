class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        boolean[] set = new boolean[2048];
        boolean[] pair = new boolean[2048];
       
            for(int j =0;j<n;j++){
                for(int k=0;k<n;k++){

                    pair[nums[j]^nums[k]]=true;
                    
                }
            }
            
            for(int j=0;j<2048;j++){
                if (!pair[j]) continue;
                for(int i =0;i<n;i++){
                    set[j^nums[i]]=true;
                }
                
            }
            int ans=0;
            for(boolean b : set){
                if(b) ans++;
            }
        
        return ans;
        
    }
}