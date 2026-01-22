class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char charT=t.charAt(i);
            if(!map.containsKey(x)){
                if (map.containsValue(charT)) {
                    return false;
                }
                map.put(x,charT);
            }
            else if(map.containsKey(x) && map.get(x)==t.charAt(i)){
                continue;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}