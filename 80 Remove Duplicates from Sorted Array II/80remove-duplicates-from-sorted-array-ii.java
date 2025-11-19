class Solution {
    public int removeDuplicates(int[] nums) {

        // keep numbers sorted
        TreeMap<Integer,Integer> map = new TreeMap<>();

        // count frequencies
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int index = 0;

        // your logic kept exactly
        for(int k : map.keySet()){
            if(map.get(k) <= 2){
                for(int i = 0; i < map.get(k); i++){
                    nums[index] = k;   // FIXED
                    index++;
                }
            }
            else{
                for(int i = 0; i < 2; i++){
                    nums[index] = k;   // FIXED
                    index++;
                }
            }
        }

        // IMPORTANT: do NOT sort or touch nums beyond index
        return index;
    }
}
