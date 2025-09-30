class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map=new HashMap <>();
        List<List<Integer>> ans=new ArrayList<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            int size=groupSizes[i];
            if(!map.containsKey(size)){

                map.put(size,new ArrayList<>());
            }
            map.get(size).add(i);
            if(map.get(size).size()==size){
                ans.add(map.get(size));
                map.put(size,new ArrayList<>());
            }

            
        }
        return ans;
    }
}