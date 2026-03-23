class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.offer(amount[0]);
        pq.offer(amount[1]);
        pq.offer(amount[2]);
        int ans=0;
        while(pq.peek()>0){
            int x=pq.poll();
            int y=pq.poll();
            if(x>0 && y>0){
                ans++;
                pq.offer(x-1);
                pq.offer(y-1);
            }
            else if(x>0){
                ans++;
                pq.offer(x-1);
                pq.offer(0);
            }
            else{
                break;
            }

        }
        return ans;
    }
}