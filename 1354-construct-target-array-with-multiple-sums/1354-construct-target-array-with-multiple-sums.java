class Solution {
    public boolean isPossible(int[] target) {
        int n=target.length;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        int sum=0;
        int id=0;
        for(int i=0;i<n;i++){
            sum+=target[i];
        }
        while(true){
            long curr=0;
            id=0;
            for(int i=0;i<n;i++){
                curr+=target[i];
                if(target[id]<target[i]){
                    id=i;
                }
            }
            curr-=target[id];
            if(curr==1 || target[id]==1){
                return true;
            }else if(target[id]<=curr || curr==0 || target[id]%curr==0){
                return false;
            }
            target[id]%=curr;

        }
        
    }
}