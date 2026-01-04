class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList=new ArrayList<>();
        back(0,new ArrayList<>(),nums,finalList);
        return finalList;
    }
    public void back(int start,List<Integer> temp,int[] nums,List<List<Integer>> finalList){
        finalList.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            back(i+1,temp,nums,finalList);
            temp.remove(temp.size()-1);
        }
    }
}