class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            q.offer(q.poll());
        }
        for(int i=0;i<n;i++){
            nums[i]=q.poll();
        }
        
    }
}