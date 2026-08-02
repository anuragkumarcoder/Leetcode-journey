class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int n = bobValues.length;
        for(int i = 0;i<n;i++){
            pq.offer(new int[] {aliceValues[i]+bobValues[i],i});
        }
        int alice=0;
        int bob=0;
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            alice+=aliceValues[arr[1]];
            if(!pq.isEmpty()){
                int[] ar=pq.poll();
                bob+=bobValues[ar[1]];
            }    
        }
        if(alice>bob){
            return 1;
        }else if(bob>alice){
            return -1;
        }else{
            return 0;
        }
    }
}