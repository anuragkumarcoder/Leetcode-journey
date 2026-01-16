import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // 1. Add banned words to a Set for fast O(1) lookup
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }

        // 2. Normalize the string:
        //    - Convert to lowercase
        //    - Replace any character that is NOT a letter or number with a space
        //    regex: "[^a-zA-Z0-9]" means "not alphanumeric"
        String normalizedStr = paragraph.toLowerCase().replaceAll("[^a-z0-9]", " ");

        // 3. Split by one or more whitespace characters
        String[] words = normalizedStr.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        String result = "";
        int maxCount = 0;

        // 4. Count words, skipping banned ones
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                
                // Track max as we go to avoid a second loop
                if (map.get(word) > maxCount) {
                    maxCount = map.get(word);
                    result = word;
                }
            }
        }

        return result;
    }
}