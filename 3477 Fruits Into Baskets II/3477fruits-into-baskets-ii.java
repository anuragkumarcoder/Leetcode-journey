class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i=0;
        int j=0;
        List<Integer>list=new ArrayList<>();
        for(int x : baskets){
            list.add(x);
        }
        int ans=0;
        for( i=0;i<fruits.length;i++){
            boolean placed=true;
            int x=fruits[i];
            for(j=0;j<list.size();j++){
                if(x<=list.get(j)){
                    list.remove(j);
                    placed =!placed;
                    break;
                }
               
            }
            
                if(placed){
                    ans++;
                }
        }
        return ans;

    }
}