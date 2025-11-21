class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int tg=0;
        int tc=0;
        for(int i=0;i<n;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc){
            return -1;
        }
        int currGas=0;
        int startIndex=0;
        for(int i=0;i<n;i++){
            currGas+=gas[i]-cost[i];
            if(currGas<0){
                startIndex=i+1;
                currGas=0;
            }
        }
        return startIndex;
    }
}