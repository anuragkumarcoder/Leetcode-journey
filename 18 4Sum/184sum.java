class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        int left=0;
        int right=n;
        Arrays.sort(nums);
        for(left=0;left<n-3;left++){
            for(right=left+1;right<n-2;right++){
                int l1=right+1;
                int r1=n-1;
            
            
            while(l1<r1){
                long sum=(long)nums[left]+nums[right]+nums[l1]+nums[r1];
                if(sum==target){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[l1]);
                    list.add(nums[r1]);
                    set.add(list);
                    l1++;
                    r1--;
                }
                else if(sum>target){
                    r1--;
                }
                else{
                    l1++;
                }
            }
            }
            
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> x:set){
            ans.add(x);
        }
        return ans;

    }
}