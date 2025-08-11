class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int moves = 0, balls = 0;

        // Left to right
        for (int i = 0; i < n; i++) {
            res[i] += moves;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            moves += balls;
        }

        moves = 0;
        balls = 0;

        // Right to left
        for (int i = n - 1; i >= 0; i--) {
            res[i] += moves;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            moves += balls;
        }

        return res;
    }
}