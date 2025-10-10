class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.putIfAbsent(matches[i][0],0);
             map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
            
        }
        ArrayList<Integer> zero=new ArrayList<>();
        ArrayList<Integer>one=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==1){
                one.add(i);
            }
            else if(map.get(i)==0){
                zero.add(i);
            }

        }
        Collections.sort(one);
        Collections.sort(zero);
         List<List<Integer>> ans = new ArrayList<>();
        ans.add(zero);
        ans.add(one);
        return ans;
        
    }
}