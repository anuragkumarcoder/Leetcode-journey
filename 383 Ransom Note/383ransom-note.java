class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> set=new HashMap<>();
         HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            set.put(magazine.charAt(i),set.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(set.getOrDefault(c,0)<map.get(c)){
            
                    return false;
            }
          
        } 
        return true; 
        
    }
}