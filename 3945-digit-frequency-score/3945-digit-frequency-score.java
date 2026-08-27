class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> list=new HashSet<>();
        while(n>0){
            int x=n%10;
            map.put(x,map.getOrDefault(x,0)+1);
            list.add(x);
            n/=10;
        }
        int ans=0;
        for(int y : list){
            int z=map.get(y);
            ans+=(z*y);
        }
        return ans;
    }
}