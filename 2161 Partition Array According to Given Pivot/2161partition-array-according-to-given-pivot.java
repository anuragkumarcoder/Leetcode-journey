class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    int n = nums.length;
    int[] result = new int[n];
    int idx = 0;
    for (int x : nums) if (x < pivot) result[idx++] = x;
    for (int x : nums) if (x == pivot) result[idx++] = x;
    for (int x : nums) if (x > pivot) result[idx++] = x;
    return result;
    }
}