class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        Stack<Integer> st = new Stack<>();
        int c = 0;  

        for (int i = 0; i < n; i++) {
            
            while ((st.isEmpty() || st.peek() != popped[i]) && c < pushed.length) {
                st.push(pushed[c]);
                c++;
            }

            
            if (st.peek() != popped[i]) return false;

            st.pop();  
        }
        return st.isEmpty();
    }
}
