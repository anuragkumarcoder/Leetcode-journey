class Solution {
    public int waysToMakeFair(int[] nums) {
        int rightEven = 0;
        int rightOdd = 0;

        // Calculate total initial even and odd sums
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                rightEven += nums[i];
            } else {
                rightOdd += nums[i];
            }
        }

        int leftEven = 0;
        int leftOdd = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            // Remove nums[i] from the right-side sum
            if (i % 2 == 0) {
                rightEven -= nums[i];
            } else {
                rightOdd -= nums[i];
            }

            // Elements to the right flip parity after removal
            if (leftEven + rightOdd == leftOdd + rightEven) {
                ans++;
            }

            // Add nums[i] to the left-side sum for the next iteration
            if (i % 2 == 0) {
                leftEven += nums[i];
            } else {
                leftOdd += nums[i];
            }
        }

        return ans;
    }
}