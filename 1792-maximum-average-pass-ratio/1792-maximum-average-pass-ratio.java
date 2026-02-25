class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->Double.compare(b[0], a[0]));
        for(int[] curr : classes){
            double pass=curr[0];
            double total=curr[1];
            double gain=((pass+1)/(total+1))-(pass/total);
            pq.offer(new double[] {gain,pass,total});
        }
        while(extraStudents>0){
            double[] curr=pq.poll();
            double pass=curr[1]+1;
            double total=curr[2]+1;
            double newGain=((pass+1)/(total+1))-(pass/total);
            pq.offer(new double[]{newGain,pass,total});
            extraStudents--;
        }
        double totalRatioSum = 0;
        while (!pq.isEmpty()) {
            double[] top = pq.poll();
            totalRatioSum += (top[1] / top[2]);
        }
        
        return totalRatioSum / classes.length;
    }
}