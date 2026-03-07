class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        int ans = binaryS(target, mountainArr, 0, peak, true);
        if (ans != -1) return ans; 
        return binaryS(target, mountainArr, peak + 1, n - 1, false);
    }
    public int findPeak(MountainArray mountainArr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        return start;
    }

    private int binaryS(int target, MountainArray arr, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);
            
            if (val == target) return mid;
            
            if (isAsc) {
                if (val > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (val > target) start = mid + 1; 
                else end = mid - 1; 
            }
        }
        return -1;
    }
}