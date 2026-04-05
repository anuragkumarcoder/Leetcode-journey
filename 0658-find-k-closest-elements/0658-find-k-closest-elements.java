class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> 
            Math.abs(x - a) == Math.abs(x - b) ? b - a : Math.abs(x - b) - Math.abs(x - a)
        );
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}