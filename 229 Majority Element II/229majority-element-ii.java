class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            int x=map.get(key);
            if(x>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}