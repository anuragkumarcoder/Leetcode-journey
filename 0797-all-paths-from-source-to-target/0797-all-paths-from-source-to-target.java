class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<List<Integer>> q=new LinkedList<>();
        q.offer(Arrays.asList(0));
        while(!q.isEmpty()){
            List<Integer> curr=q.poll();
            int dest=curr.get(curr.size()-1);
            if(dest==graph.length-1){
                result.add(curr);
            }else{
                for(int x : graph[dest]){
                    List<Integer> list=new ArrayList<>(curr);
                    list.add(x);
                    q.offer(list);
                
                }
            }
        }
        return result;
    }
}