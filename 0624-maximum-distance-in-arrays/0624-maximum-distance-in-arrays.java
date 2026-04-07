class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        for(int i=1;i<arrays.size();i++){
            List<Integer> list=arrays.get(i);
            int currentMin = list.get(0);
            int currentMax = list.get(list.size() - 1);
            res=Math.max(res,currentMax-minVal);
            res=Math.max(res,maxVal-currentMin);
            minVal=Math.min(minVal,currentMin);
            maxVal=Math.max(maxVal,currentMax);
        }
        return res;
    }
}