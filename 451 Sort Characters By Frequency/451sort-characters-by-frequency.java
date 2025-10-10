class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder("");
       
        while(!map.isEmpty()){
             int max=0;
            char ch='\0';
            for(char c:map.keySet()){
                if(map.get(c)>max) {
                    max=map.get(c);
                    ch=c;
                }
            }
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
            map.remove(ch);
        }
        return sb.toString();

    }
}