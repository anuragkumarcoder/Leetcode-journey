class NumArray {
    private int[] tree;
    private int[] nums;
    private int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        this.tree = new int[n + 1];
        // Build the tree in O(n log n)
        for (int i = 0; i < n; i++) {
            add(i + 1, nums[i]);
        }
    }

    public void update(int index, int val) {
        int delta = val - nums[index]; // Calculate the change
        nums[index] = val;
        add(index + 1, delta); // Update the tree with the difference
    }

    public int sumRange(int left, int right) {
        // Range sum is: (Sum from 0 to right) - (Sum from 0 to left-1)
        return query(right + 1) - query(left);
    }

    // Helper: Updates the tree at index i and its ancestors
    private void add(int i, int delta) {
        for (; i <= n; i += i & -i) {
            tree[i] += delta;
        }
    }

    // Helper: Gets the prefix sum from index 1 to i
    private int query(int i) {
        int sum = 0;
        for (; i > 0; i -= i & -i) {
            sum += tree[i];
        }
        return sum;
    }
}