class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)>1){
                return true;
            }
        }
        return false;
    }
}