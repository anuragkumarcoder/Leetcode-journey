class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
        }

        int dominant = -1, totalCount = 0;
        for(int key : map.keySet()){
            if(map.get(key) * 2 > n){
                dominant = key;
                totalCount = map.get(key);
                break;
            }
        }

        int countLeft = 0;
        for(int i=0; i<n-1; i++){
            if(nums.get(i) == dominant){
                countLeft++;
            }
            int leftLen = i+1;
            int rightCount = totalCount - countLeft;
            int rightLen = n - leftLen;

            if(countLeft * 2 > leftLen && rightCount * 2 > rightLen){
                return i;
            }
        }
        return -1;
    }
}
