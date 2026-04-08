class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(List<String> list : responses){
            HashSet<String> set=new HashSet<>();
            for(String s : list){
                set.add(s);
            }
            for(String s : set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        int max=0;
        int curr=0;
        String lar="";
        for(String s : map.keySet()){
            curr=map.get(s);
            if(curr>max){
                lar=s;
                max=curr;
            }
            else if(curr==max){    
            lar = lar.equals("") || s.compareTo(lar) < 0 ? s : lar;
            }
        }
        return lar;
    }
}