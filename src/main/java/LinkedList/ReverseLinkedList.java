package LinkedList;

/*Учитывая head односвязный список, переверните список и верните перевернутый список*/

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3)))));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
