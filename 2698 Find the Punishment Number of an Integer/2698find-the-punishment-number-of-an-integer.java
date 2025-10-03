class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (canPartition(String.valueOf(sq), 0, i)) {
                ans += sq;
            }
        }
        return ans;
    }

    // Backtracking helper to check if we can partition sq string into substrings summing to target
    private boolean canPartition(String s, int idx, int target) {
        if (idx == s.length()) return target == 0;

        int num = 0;
        for (int j = idx; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (num > target) break; // pruning
            if (canPartition(s, j + 1, target - num)) return true;
        }
        return false;
    }
}
