class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        for (String word : words) {
            if (matches(word, pattern)) {
                list.add(word);
            }
        }
        return list;
    }

    // Helper method to check if word matches pattern
    private boolean matches(String word, String pattern) {
        // We use arrays as maps because inputs are lowercase English letters (indices 0-25)
        // Storing the LAST seen position of each character works well.
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            // If the mapping of current characters doesn't match the previously seen mapping
            if (m1[w] != m2[p]) {
                return false;
            }

            // Mark the index where we saw these characters (i + 1 to avoid 0 confusion)
            m1[w] = i + 1;
            m2[p] = i + 1;
        }
        return true;
    }
}