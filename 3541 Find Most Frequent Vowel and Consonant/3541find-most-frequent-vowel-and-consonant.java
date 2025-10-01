class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> cons=new HashMap<>();
        HashMap<Character,Integer> vow=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char   c=s.charAt(i);
            if((int)c==97||(int)c==101||(int)c==105||(int)c==111||(int)c==117){
                vow.put(c,vow.getOrDefault(c,0)+1);
            }
            else{
                cons.put(c,cons.getOrDefault(c,0)+1);
            }
        }
        int maxv=0;
        for(int v:vow.values()){
            if(maxv<v){
                maxv=v;
            }
        }
        int maxc=0;
        for(int c:cons.values()){
            if(maxc<c){
                maxc=c;
            }
        }
        return maxc+maxv;
    }
}