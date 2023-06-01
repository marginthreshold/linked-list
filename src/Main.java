public class Main {
    public static void main(String[] args) {

        System.out.println("");
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode createLinkedList(int[] array) {
        ListNode head = null;
        ListNode curr = null;
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                curr = node;
            }
        }
        return head;
    }
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}