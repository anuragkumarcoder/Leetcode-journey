class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> set=new HashSet<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        int n=nums[i];
        while(right>left){
            if(n+nums[left]+nums[right]==0){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(n);
                list.add(nums[left]);
                list.add(nums[right]);
                set.add(list);
                left++;
                right--;
            }
            else if(n+nums[left]+nums[right]>0){
                right--;
            }
            else{
                left++;
            }
        }

       } 
       ArrayList<List<Integer>> ans=new ArrayList<>();
       for(List n:set){
        ans.add(n);
       }
       return ans;
    }
}