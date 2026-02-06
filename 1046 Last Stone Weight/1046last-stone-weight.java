class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            list.add(stones[i]);
        }
        while(list.size()>1){
            Collections.sort(list);
            int lastInd=list.size()-1;
            int secondInd=list.size()-2;
            int weight1 = list.get(lastInd);
            int weight2 = list.get(secondInd);
            if(weight1-weight2!=0){
                list.set(secondInd,weight1-weight2);
                list.remove(lastInd);
            }
            else{
                list.remove(lastInd);
                list.remove(secondInd);
            }
        }
        if(list.size()==0){
            return 0;
        }
        return list.get(0);
    }
}