class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max=0;
        String a="";

        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<k;i++){
                    
            for(String s : map.keySet()){
               if (map.get(s) > max || (map.get(s) == max && (a.equals("") || s.compareTo(a) < 0))){
                    max=map.get(s);
                    a=s;
                }
            }
            max=0;
            list.add(a);
            map.remove(a);
        }
        return list;
    }
}