class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
       } 
       ArrayList<Integer>list=new ArrayList<>();
       for(int x : map.keySet()){
        if(map.get(x)==1){
            list.add(x);
        }
       }
       int ans[]=new int[2];
       ans[0]=list.get(0);
       ans[1]=list.get(1);
       return ans;
    }
}