class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxPicked=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            int curr=fruits[i];
            map.put(curr,map.getOrDefault(curr,0)+1);
            while(map.size()>2){
                int rem=fruits[left];
                int freq=map.get(rem)-1;
                left++;
                if(freq==0){
                    map.remove(rem);
                }
                else{
                    map.put(rem,freq);
                }
            }
            maxPicked=Math.max(maxPicked,i-left+1);
        }
        return maxPicked;
    }
}