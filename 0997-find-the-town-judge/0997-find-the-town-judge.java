class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){
            return 1;
        }
        HashMap<Integer,Integer> inc=new HashMap<>();
        HashMap<Integer,Integer> out=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            int x = trust[i][0];
            int y  = trust[i][1];
            inc.put(y,inc.getOrDefault(y,0)+1);
            out.put(x,out.getOrDefault(x,0)+1);
        }
        int req=n-1;
        for(int x : inc.keySet()){
            if(inc.get(x)==req && out.get(x)==null){
                return x;
            }
        }
        return -1;
    }
}