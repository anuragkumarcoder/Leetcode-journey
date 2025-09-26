class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);

        }
        while(q.size()!=1){
            int count=1;
            for(int i=1;i<=k;i++){
                if(count!=k){
                    q.add(q.remove());
                    count++;
                }
                else{
                    q.remove();
                }
            }
        }
        return q.remove();
    }
}