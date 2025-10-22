class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int[] diff = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = reward1[i] - reward2[i];
            total += reward2[i]; // assume all eaten by mouse 2
        }

        Arrays.sort(diff); // ascending
        for (int i = 0; i < k; i++) {
            total += diff[n - 1 - i]; // add k largest diffs
        }

        return total;
    }
}
