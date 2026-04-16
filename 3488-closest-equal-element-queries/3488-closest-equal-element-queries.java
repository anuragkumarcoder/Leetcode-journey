import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        
        // 1. Group indices by their values in nums
        Map<Integer, List<Integer>> valToIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valToIndices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i];
            int y = nums[x];
            List<Integer> indices = valToIndices.get(y);

            // If the value only appears once, no other index exists
            if (indices.size() <= 1) {
                list.add(-1);
                continue;
            }

            // 2. Use Binary Search to find where 'x' is in the sorted list of indices
            int pos = Collections.binarySearch(indices, x);
            int m = indices.size();
            
            // 3. The closest elements are the immediate neighbors in the sorted list
            // We use modulo to handle the circular wrap-around automatically
            int leftNeighbor = indices.get((pos - 1 + m) % m);
            int rightNeighbor = indices.get((pos + 1) % m);

            // Calculate circular distance for both neighbors
            int distL = Math.abs(x - leftNeighbor);
            int distR = Math.abs(x - rightNeighbor);
            
            int minDist = Math.min(
                Math.min(distL, n - distL), 
                Math.min(distR, n - distR)
            );

            list.add(minDist);
        }
        return list;
    }
}