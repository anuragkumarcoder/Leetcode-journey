class Solution {
    public int findKthPositive(int[] arr, int k) {
        List <Integer> missing=new ArrayList<>();
        int j=1;
        int i=0;
        while(missing.size()<k){
            if(i<arr.length && arr[i]==j){
                
                i++;
            }
            else{
                missing.add(j);
                
            }
            j++;
        }
        return missing.get(k-1);

        
    }
}