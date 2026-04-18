class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       int[] count = new int[1001];
       for (int[] pair : nums1) {
            count[pair[0]] += pair[1];
        }
        for (int[] pair : nums2) {
            count[pair[0]] += pair[1];
        }
        List<int[]> result = new ArrayList<>();
        for (int id = 0; id < count.length; id++) {
            if (count[id] > 0) {
                result.add(new int[]{id, count[id]});
            }
        }
        int[][] ans=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}