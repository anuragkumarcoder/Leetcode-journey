class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Base check
        if (s == null || s.isEmpty()) return false;
        
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // empty prefix is always valid
        
        // outer loop for each character in string
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                String word = wordDict.get(j);
                int len = word.length();
                if (i >= len && dp[i - len] && s.substring(i - len, i).equals(word)) {
                    dp[i] = true;
                    break; // found a valid break
                }
            }
        }
        
        return dp[s.length()];
    }
}
