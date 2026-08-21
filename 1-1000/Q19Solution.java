// Leetcode Problem 19: Remove Nth Node From End of List
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Q19Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i = 1; i < n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        int k = sc.nextInt();
        head = removeNthFromEnd(head, k);
        printList(head);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode fast = temp;
        ListNode slow = temp;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return temp.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}