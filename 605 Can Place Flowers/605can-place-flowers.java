class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if (flowerbed.length == 1 && flowerbed[0] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            else if(i==0){
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
            }    
            else if(i==flowerbed.length-1){
                if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                    flowerbed[flowerbed.length-1]=1;
                    n--;
                }
            } 
            else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }   
            if(n <= 0) return true;
            
        }
        return n<=0;
    }
}