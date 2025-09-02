class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;

        // Traverse both lists
        while (temp1 != null || temp2 != null) {
            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            list.add(sum % 10); // store the digit
            carry = sum / 10;   // update carry

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        // If there is still a carry
        if (carry > 0) {
            list.add(carry);
        }

        // Convert ArrayList to linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}
