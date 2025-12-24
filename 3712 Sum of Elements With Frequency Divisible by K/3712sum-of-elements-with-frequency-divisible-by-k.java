class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int x : map.keySet()){
            if(map.get(x)%k==0){
                ans+=(x*map.get(x));
            }
        }
        return ans;
        
    }
}