import java.util.Arrays;

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int ans = 0;
        int n = properties.length;

        // Step 1: Sort by attack descending, and for same attack, defense ascending
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        // Step 2: Track max defense so far
        int maxDef = 0;

        for (int i = 0; i < n; i++) {
            if (properties[i][1] < maxDef) {
                ans++;  // weak character
            } else {
                maxDef = properties[i][1];  // update max defense
            }
        }

        return ans;
    }
}
