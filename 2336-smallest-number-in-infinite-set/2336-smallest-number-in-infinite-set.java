class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    HashSet<Integer> set;
    int min;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        set=new HashSet<>();
        min=1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            int x=pq.poll();
            set.remove(x);
            return x;

        }
        return min++;
        
    }
    
    public void addBack(int num) {
        if(num<min && !pq.contains(num)){
            pq.offer(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */