class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        for(int x : nums){
            if(x>0){
                list.add(x);
            }
        }
        int i=1;
        for(int x : list){
            if(x==i){
                i++;
                
            }
            else if(x>i){
                return i;
                
            }
        }
        return i++;
    }
}