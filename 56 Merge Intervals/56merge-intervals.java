class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0]; 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        list.add(current);

        for (int j = 1; j < intervals.length; j++) {
            if (current[1] >= intervals[j][0]) {
                current[1] = Math.max(current[1], intervals[j][1]);
            } else {
                current = intervals[j];
                list.add(current);
            }
        }
        int ans[][] = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}