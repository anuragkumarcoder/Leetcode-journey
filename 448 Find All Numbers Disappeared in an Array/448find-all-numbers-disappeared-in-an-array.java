class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] dummy = new int[n];
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 1; i <= n; i++) {
            dummy[i - 1] = i;
        }

        int i = 0, j = 0;

        while (i < n && j < n) {
            if (nums[i] == dummy[j]) {
                i++;
                j++;
            } else if (nums[i] > dummy[j]) {
                list.add(dummy[j]);
                j++;
            } else {
                i++;
            }
        }

        while (j < n) {
            list.add(dummy[j]);
            j++;
        }

        return list;
    }
}
