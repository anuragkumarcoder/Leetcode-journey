class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int mt=numBottles;
        int ans=mt;
        while(mt>=numExchange){
            mt-=numExchange;
            mt++;
            ans++;
            numExchange++;
          
        }
        return ans;
    }
}