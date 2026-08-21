// LeetCode Problem No.2

import java.util.*;
public class Q2Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes in first linked list: ");
        int n1 = sc.nextInt();
        
        System.out.println("Enter elements:");
        ListNode l1 = createList(sc, n1);

        System.out.print("Enter number of nodes in second linked list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements:");
        ListNode l2 = createList(sc, n2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("\nResult Linked List:");
        printList(result);

        sc.close();

    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }   

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }       
    }
// Main logic of add number 

     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;

        ListNode head = new ListNode(0);
        ListNode node = head;

        while (l1 != null || l2 != null || carry != 0) {

            sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        return head.next;
    }


    // Create Linked List from user input
    public static ListNode createList(Scanner sc, int n) {

        if (n == 0)
            return null;

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        return head;
    }


    // Print Linked List
    public static void printList(ListNode node) {

        while (node != null) {
            System.out.print(node.val);

            if (node.next != null)
                System.out.print(" -> ");

            node = node.next;
        }

        System.out.println();
    }

}
