// Leetcode Problem 21: Merge Two Sorted Lists
import java.util.*;
public class Q21Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        ListNode l1 = new ListNode(sc.nextInt());
        ListNode current1 = l1;
        for(int i=1; i<n1; i++){
            current1.next = new ListNode(sc.nextInt());
            current1 = current1.next;
        }

        int n2 = sc.nextInt();
        ListNode l2 = new ListNode(sc.nextInt());
        ListNode current2 = l2;
        for(int i=1; i<n2; i++){
            current2.next = new ListNode(sc.nextInt());
            current2 = current2.next;
        }

        Q21Solution solution = new Q21Solution();
        ListNode mergedList = solution.mergeTwoLists(l1, l2);
        
        // Print the merged list
        while(mergedList != null){
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}