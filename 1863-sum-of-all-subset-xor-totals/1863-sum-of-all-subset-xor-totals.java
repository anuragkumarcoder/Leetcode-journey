class Solution {
    int ans;
    public int subsetXORSum(int[] nums) {
        ans=0;
        ArrayList<Integer> temp=new ArrayList<>();
        helper(nums,0,temp);
        return ans;
    }
    void helper(int[] nums,int ind,ArrayList<Integer> temp){
        if(ind==nums.length){
            int current=0;
            for(int i=0;i<temp.size();i++){
                
                current^=temp.get(i);
                
            }
            ans+=current;
            return;
        }
        temp.add(nums[ind]);
        helper(nums,ind+1,temp);
        temp.remove(temp.size()-1);
        helper(nums,ind+1,temp);

    }
}