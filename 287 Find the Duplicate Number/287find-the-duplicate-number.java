class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
           for(int c : map.keySet()){
                if(map.get(c)>1){
                    return c;
                }
            }
            return -1;
    
   
    }
}