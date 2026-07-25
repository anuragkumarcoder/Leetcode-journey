class Solution {
    public int maxProduct(int n) {
        List<Integer> list =new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
            
        }
        int m = list.size()-1;
        Collections.sort(list);
        return list.get(m)*list.get(m-1);
    }
}