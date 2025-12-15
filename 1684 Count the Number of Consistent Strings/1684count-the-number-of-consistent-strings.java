class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;
            
            for (int j = 0; j < word.length(); j++) {
                if (!allowedSet.contains(word.charAt(j))) {
                    isConsistent = false;
                    break; 
                }
            }
            
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }
}