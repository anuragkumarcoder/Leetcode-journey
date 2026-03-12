class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.add(val);
        }
        
        int[] result = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int alice = pq.poll();
            int bob = pq.poll();   
            result[i++] = bob;
            result[i++] = alice;
        }
        
        return result;
    }
}