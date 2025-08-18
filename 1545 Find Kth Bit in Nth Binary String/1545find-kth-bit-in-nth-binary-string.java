class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        for (int i = 2; i <= n; i++) {
            StringBuilder t = new StringBuilder(s.length());
            for (int idx = 0; idx < s.length(); idx++) {
                t.append(s.charAt(idx) == '0' ? '1' : '0'); // invert
            }
            t.reverse();
            s = s + "1" + t.toString();
        }
        return s.charAt(k - 1);
    }
}
