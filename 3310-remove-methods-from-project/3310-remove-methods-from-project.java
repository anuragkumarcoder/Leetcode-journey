class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] inv : invocations){
            list.get(inv[0]).add(inv[1]);
        }
        boolean[] flag = new boolean[n];
        Queue<Integer> q =new LinkedList<>();
        q.offer(k);
        flag[k]=true;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int y :list.get(x)){
                if(!flag[y]){
                    flag[y
                    ]=true;
                    q.offer(y);
                }
            }
        }
        boolean f = false;
        for(int[] inv : invocations){
            int x = inv[0];
            int y = inv[1];
            if(!flag[x] && flag[y]){
                f=true;
                break;
            }
        }
        List<Integer> result =new ArrayList<>();
        for(int i =0;i<n;i++){
            if(!f){
                if(!flag[i]){
                    result.add(i);
                }
            }else{
                result.add(i);
            }
        }
        return result;

    }
}