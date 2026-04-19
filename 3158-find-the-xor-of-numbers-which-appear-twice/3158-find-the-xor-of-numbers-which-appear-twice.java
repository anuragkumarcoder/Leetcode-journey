class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        } 
        int ans=0;
        for(int x : map.keySet()){
            if(map.get(x)==2){
                ans^=x;
            }
        }
        return ans;
    }
}