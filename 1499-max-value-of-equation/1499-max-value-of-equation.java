class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max=Integer.MIN_VALUE;
        PriorityQueue<int[]> dq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<points.length;i++){
            int xj=points[i][0];
            int yj=points[i][1];
            while(!dq.isEmpty() && xj-dq.peek()[1]>k){
                dq.poll();
            }
            if(!dq.isEmpty()){
                int curr=dq.peek()[0];
                max=Math.max(curr+xj+yj,max);
            }
            dq.offer(new int[]{yj-xj,xj});
        }
        return max;
    }
}