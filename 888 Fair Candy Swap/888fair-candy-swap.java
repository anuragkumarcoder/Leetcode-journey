class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

       int n=aliceSizes.length;
       int m=bobSizes.length;
       int summ=0;
       int sumn=0;
       for(int i=0;i<n;i++){
        sumn+=aliceSizes[i];
       } 
       for(int i=0;i<m;i++){
        summ+=bobSizes[i];
       } 
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(sumn-aliceSizes[i]+bobSizes[j]==summ-bobSizes[j]+aliceSizes[i]){
                return new int[]{aliceSizes[i],bobSizes[j]};
            }
        }
       }
       return new int[]{};
    }
}