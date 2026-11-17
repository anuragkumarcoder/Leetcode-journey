import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;
    
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = (int) (totalSum % p);
        if (target == 0) {
            return 0; }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        long currentPrefixSum = 0;
        int minLength = n;
        for (int i = 0; i < n; i++) {
            currentPrefixSum += nums[i];
            int currentRem = (int) (currentPrefixSum % p);
          
            int neededRem = (currentRem - target + p) % p;
            
            if (map.containsKey(neededRem)) {
                minLength = Math.min(minLength, i - map.get(neededRem));
            }
           
            map.put(currentRem, i);
        }
        
        
        return minLength == n ? -1 : minLength;
    }
}