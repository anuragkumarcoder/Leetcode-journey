import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = new HashSet<>();
        
        for (int num : arr1) {
            int val = num;
            while (val > 0) {
                prefixes.add(val);
                val /= 10;
            }
        }
        
        int maxLength = 0;
        
        for (int num : arr2) {
            int val = num;
            while (val > 0) {
                if (prefixes.contains(val)) {
                    
                    maxLength = Math.max(maxLength, String.valueOf(val).length());
                }
                val /= 10;
            }
        }
        
        return maxLength;
    }
}