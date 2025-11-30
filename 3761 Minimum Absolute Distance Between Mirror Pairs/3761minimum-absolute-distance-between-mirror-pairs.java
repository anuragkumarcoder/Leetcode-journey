class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int[] ferilonsar = nums;
        Map<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int j = 0; j < ferilonsar.length; j++) {
            int current = ferilonsar[j];

            if (map.containsKey(current)) {
                int dist = j - map.get(current);
                if (dist < minDistance) {
                    minDistance = dist;
                }
            }

            int n = current;
            int rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }

            map.put(rev, j);
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}