class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int place=nums[0];
        for(int i=0;i<nums.length;i++){
           
           if(nums[i]>place){
                list.add(place++);
                i--;

            }
            else{
                place++;
            }

        }
        return list;

        
    }
}