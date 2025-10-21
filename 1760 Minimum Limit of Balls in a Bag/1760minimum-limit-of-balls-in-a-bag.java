class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int x : nums) right = Math.max(right, x);
        
        while (left < right) {
            int mid = (left + right) / 2;
            int ops = 0;
            for (int x : nums)
                ops += (x - 1) / mid;
            if (ops > maxOperations)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
