class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        int[] ans=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        int i=0;
        while(!q.isEmpty()){
            ans[q.remove()]=deck[i++];
            if(!q.isEmpty()){
                q.add(q.remove());
            }
            
        }
        return ans;

    }
}