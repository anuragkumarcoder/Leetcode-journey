class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end=0;
        int start=1;
        for(int i=0;i<piles.length;i++){
              if(piles[i]>end){
               end=piles[i];
            }
        }    
            
            while(start<end){
                int k=0;
                int mid=start+(end-start)/2;
                for(int i=0;i<piles.length;i++){
                  k+=(piles[i]+mid-1)/mid;
                     
                }  
                
                 if(k>h){
                    start=mid+1;
                } 
                else{
                    end=mid;
                }

            }
            
        
            return start;   
    }
}