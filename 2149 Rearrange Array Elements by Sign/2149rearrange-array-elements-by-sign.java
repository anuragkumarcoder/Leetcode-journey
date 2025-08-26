class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int[] ans=new int[nums.length];        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int p=0;
        int a=0;
        for(int i=0;i<n;i+=2){
            ans[i]=pos.get(p);
            ans[i+1]=neg.get(a);
            p++;
            a++;
        }
        return ans;
    }
}