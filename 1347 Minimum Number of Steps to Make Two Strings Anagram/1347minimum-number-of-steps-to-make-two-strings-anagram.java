class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        int idxs=0;
        int idxt=0;
        while(idxs<s.length()){
            
                char c=s.charAt(idxs);
                if(maps.containsKey(c)){
                    maps.put(c,maps.get(c)+1);
                }
                else{
                    maps.put(c,1);
                }
                idxs++;
        }
            while(idxt<t.length()){
                char x=t.charAt(idxt);
                if(mapt.containsKey(x)){
                    mapt.put(x,mapt.get(x)+1);
                }
                else{
                    mapt.put(x,1);
                }
                idxt++;
            }
        
        int ans=0;
        for(char c : maps.keySet()){
            int counts=maps.get(c);
            int countt=mapt.getOrDefault(c,0);
            if(counts>countt) ans+=counts-countt;
            
        }
        return ans;

    }
}