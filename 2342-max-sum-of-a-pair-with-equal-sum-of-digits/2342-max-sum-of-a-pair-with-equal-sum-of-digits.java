class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int x : nums){
            int sum=0;
            int temp=x;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
           if (map.containsKey(sum)) {
                ans = Math.max(ans, x + map.get(sum));
            }
            map.put(sum, Math.max(x, map.getOrDefault(sum, 0)));
        }
        return ans;
    }
}