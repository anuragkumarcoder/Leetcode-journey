class Solution {
    public int matrixSum(int[][] nums) {
        int ans=0;
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        for(int i=0;i<nums[0].length;i++){
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
            for(int j=0;j<nums.length;j++){
                pq.offer(nums[j][i]);
            }
            ans+=pq.poll();
        }
        return ans;
    }
}