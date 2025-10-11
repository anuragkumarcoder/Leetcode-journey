class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length;
        int anc=0;
        int ans=0;
        for(int i=0;i<n && anc<trainers.length;i++){
            while(anc<trainers.length && trainers[anc]<players[i]  ){
                anc++;
            }
            if(anc<trainers.length){
            anc++;
            ans++;
            }
        }
        return ans;
    }
}