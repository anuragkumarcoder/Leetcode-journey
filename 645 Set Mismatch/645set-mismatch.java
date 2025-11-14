

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            }
        }

        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int x : nums) sum += x;

        
        ans[1] = total - (sum - ans[0]);

        return ans;
    }
}
