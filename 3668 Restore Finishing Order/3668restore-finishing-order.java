class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=order.length;
        Set<Integer> frnd=new HashSet<>();
        for(int f:friends){
            frnd.add(f);
        }
        int[] ans=new int[friends.length];
        int c=0;
        for(int i=0;i<n;i++){
            if(frnd.contains(order[i])){
                ans[c]=order[i];
                c++;
            }
        }
        return ans;
    }
}