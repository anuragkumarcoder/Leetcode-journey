class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=9;i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int x = q.poll();
            if(x > high){
                continue;
            }
            if(x < low){
                
                int one = x % 10;
                if(one < 9){
                    x*=10;
                    x+= one + 1;
                    q.offer(x);
                }
                
                continue;
            
            }
            if(low <= x &&  x <= high){
                list.add(x);
                int one = x % 10;
                 if(one < 9){
                    x*=10;
                    x+= one + 1;
                    q.offer(x);
                }
            }
            

            
        }
        return list;
    }
}