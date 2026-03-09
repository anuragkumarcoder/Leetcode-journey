class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
     int start=n;
     Arrays.sort(satisfaction);
     int total=0;
     for(int i=n-1;i>=0;i--){
        total+=satisfaction[i];
        if(total<0){
            break;
        }
        start=i;
     } 
     
     if (total <= 0 && start == 0 && satisfaction[n-1] <= 0) return 0;
     total=0;
     int time=1;
     for(int i=start;i<n;i++){
        total+=(time++)*(satisfaction[i]);

     } 
     return total;
    }
}