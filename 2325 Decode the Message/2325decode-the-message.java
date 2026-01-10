class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int ind = 97;
        for (char c : key.toCharArray()) {
            if (c == ' ') {
                continue;
            } if(!map.containsKey(c)) {
                map.put(c, (char) ind++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            }
            else{
                sb.append(map.get(c));
            }
        }

        return sb.toString();
    }
}