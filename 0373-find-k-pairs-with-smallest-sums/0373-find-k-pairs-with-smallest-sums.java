class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
       List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return result;
        }
        for(int j=0;j<Math.min(k,nums2.length);j++){
            pq.offer(new int[]{nums1[0]+nums2[j],0,j});
        }
        while(k-->0 && !pq.isEmpty()){
            int[] curr=pq.poll();
            int i=curr[1];
            int j=curr[2];
            result.add(Arrays.asList(nums1[i],nums2[j]));
            if(i+1<nums1.length){
                pq.offer(new int[]{nums1[i+1]+nums2[j],i+1,j});
            }
        }
        return result;
        
    }
}