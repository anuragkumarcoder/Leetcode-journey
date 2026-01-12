class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            set.add(c); 
        }
        for(char c = 'Z'; c >= 'A'; c--){
            if(set.contains(c) && set.contains(Character.toLowerCase(c))){
                return Character.toString(c);
            }
        }
        
        return "";
    }
}