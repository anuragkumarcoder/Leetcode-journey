class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char c='x';
        for(char x : s.toCharArray()){
            if(map.containsKey(x)){
                c=x;
                break;
            }
            map.put(x,1);
        }
        return c;
    }
}