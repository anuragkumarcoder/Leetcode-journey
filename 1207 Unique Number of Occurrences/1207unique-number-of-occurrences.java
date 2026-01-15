class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int x : map.keySet()){
            list.add(map.get(x));
        }
        Collections.sort(list);
        
        for(int x=0;x<list.size()-1;x++){
            if(list.get(x).equals(list.get(x+1))){
                return false;
            }
        }
        return true;
    }
}