class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int ans=0;
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=i;
            arr[i][1]=nums[i];
            int x=nums[i];
            int sum=0;
            while(x>0){
                sum+=(x%10);
                x/=10;
            }
            arr[i][2]=sum;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[2]!=b[2]){
                return Integer.compare(a[2],b[2]);
            }
            return Integer.compare(a[1],b[1]);
        }
        );
        for(int i=0;i<n;i++){
            while(arr[i][0]!=i){
                int ti=arr[i][0];
                
                int[] temp=arr[i];
                arr[i]=arr[ti];
                arr[ti]=temp;
                ans++;
            }
        }
            return ans;
        
    }
}