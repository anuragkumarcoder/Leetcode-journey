class Solution {
    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode temp = reverse(head);      
        ListNode newHead = null;
        int carry = 0;
        ListNode curr = temp;
        while (curr != null || carry != 0) {
            int val = (curr != null) ? curr.val : 0;
            int doubledVal = val * 2 + carry;
            ListNode newNode = new ListNode(doubledVal % 10);
            newNode.next = newHead;
            newHead = newNode;           
            carry = doubledVal / 10;
            if (curr != null) {
                curr = curr.next;
            }
        }
        return newHead;
    }
}