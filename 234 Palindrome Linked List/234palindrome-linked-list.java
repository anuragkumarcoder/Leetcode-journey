class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Count nodes
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        // Move to middle
        temp = head;
        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }

        // Reverse second half
        ListNode prev = null;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }

        // Compare first and second half
        ListNode dummy = prev;  // start of reversed second half
        temp = head;
        for (int i = 0; i < count / 2; i++) {
            if (dummy.val != temp.val) return false;
            dummy = dummy.next;
            temp = temp.next;
        }

        return true;
    }
}
