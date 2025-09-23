class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            int j = 0;
            
            // fix: find the index of n in nums2
            while (j < nums2.length && nums2[j] != n) {
                j++;
            }
            
            // fix: start searching from j+1, not j
            arr[i] = -1; // default
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > n) {
                    arr[i] = nums2[k];
                    break;   // fix: stop after first greater
                }
            }
        }
        
        return arr;
    }
}
