class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList=new ArrayList<>();
        back(0,nums,finalList,new ArrayList<>());
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<finalList.size();i++){
            set.add(finalList.get(i));
        }
        finalList.clear();
        for(List<Integer> x : set){
            finalList.add(x);
        }
        return finalList;
    }
    public void back(int start,int[] nums,List<List<Integer>> finalList,List<Integer> temp){
        finalList.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            back(i+1,nums,finalList,temp);
            temp.remove(temp.size()-1);
        }
    }
}