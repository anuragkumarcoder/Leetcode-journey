import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        boolean flag = false;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                flag = true;
                break;
            }
        }

        int arr[] = new int[2];
        if (flag) {
            int left = mid - 1;
            int right = mid + 1;
            while (left >= 0 && nums[left] == target) left--;
            while (right < nums.length && nums[right] == target) right++;
            arr[0] = left + 1;
            arr[1] = right - 1;
            return arr;
        }

        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
}
