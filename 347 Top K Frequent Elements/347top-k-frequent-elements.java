class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            int max=0;
            int key=0;

            for(int x : map.keySet()){
                if(map.get(x)>max) {
                    key=x;
                    max=map.get(x);
                }
                 arr[i]=key;
            }
            map.remove(key);
           
        }
        return arr;

    }
}