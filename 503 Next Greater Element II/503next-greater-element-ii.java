class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);  // default = -1
        Stack<Integer> st = new Stack<>();
        
        // traverse twice for circularity
        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];
            
            // resolve previous indices
            while (!st.isEmpty() && nums[st.peek()] < curr) {
                int prev = st.pop();
                ans[prev] = curr;
            }
            
            // only push in first pass
            if (i < n) st.push(i);
        }
        
        return ans;
    }
}
