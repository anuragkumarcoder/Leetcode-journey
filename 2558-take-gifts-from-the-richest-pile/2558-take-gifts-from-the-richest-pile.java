class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x : gifts){
            pq.offer(x);
        }
        long sum=0;
        while(k>0){
            int z=pq.poll();
             z=(int)Math.sqrt(z);
             pq.offer(z);
            k--;
        }
        while(!pq.isEmpty()){
            sum+=(long)pq.poll();
        }
        return sum;
    }
}