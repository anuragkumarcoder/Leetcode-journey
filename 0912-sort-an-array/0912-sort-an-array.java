class Solution {
    public int[] sortArray(int[] nums) {
     PriorityQueue<Integer> pq=new PriorityQueue<>();
     for(int x : nums){
        pq.offer(x);
     }
     for(int i=0;i<nums.length;i++){
        nums[i]=pq.poll();
     }
     return nums;
    }
}