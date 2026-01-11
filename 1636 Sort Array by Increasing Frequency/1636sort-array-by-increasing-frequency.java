import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(); // 1. Defined list
        
        // 2. Loop until map is empty
        while(!map.isEmpty()){ 
            int bestKey = -1;
            int minFreq = Integer.MAX_VALUE; // Start with MAX to find min
            
            // 3. Find the number with Lowest Freq (and Highest Value if tied)
            for(int x : map.keySet()){
                int freq = map.get(x);
                
                // If we found a lower frequency, OR same frequency but bigger number
                if(freq < minFreq || (freq == minFreq && x > bestKey)){
                    minFreq = freq;
                    bestKey = x;
                }
            }
            
            // 4. Add the number to the list 'freq' times
            for(int k=0; k<minFreq; k++) list.add(bestKey);
            
            // 5. Remove from map so we don't pick it again
            map.remove(bestKey); 
        } 
        
        // 6. Manual conversion from List to int[] (Required by LeetCode)
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) result[i] = list.get(i);
        
        return result;   
    }
}