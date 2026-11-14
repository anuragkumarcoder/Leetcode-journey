class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int left=0;
            int right=0;
            int sum=Integer.MAX_VALUE;
            int curr=0;
            while(right<nums.size()){
                curr+=nums.get(right);
                if(right-left+1<i){
                    right++;
                }else if(right-left+1==i){
                    
                    if(curr>0 && curr<sum){
                        sum=curr;
                    }
                    curr-=nums.get(left++);
                    right++;
                }
                

            }
            if(sum>=0 && sum!=Integer.MAX_VALUE){
                min=Math.min(min,sum);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }
        
    }
}