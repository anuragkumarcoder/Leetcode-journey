class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int mt=numBottles;
        int ans=mt;
        while(mt>=numExchange){
            mt-=numExchange;
            mt++;
            ans++;
        }
        return ans;
    }
}