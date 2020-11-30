package main.java;

import java.math.BigInteger;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

*/

public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head1 = createNode(0);
        insertEnd(head1,8);
        insertEnd(head1,6);
        insertEnd(head1,5);
        insertEnd(head1,6);
        insertEnd(head1,8);
        insertEnd(head1,3);
        insertEnd(head1,5);
        insertEnd(head1,7);
        

        ListNode head2 = createNode(6);
        insertEnd(head2,7);
        insertEnd(head2,8);
        insertEnd(head2,0);
        insertEnd(head2,8);
        insertEnd(head2,5);
        insertEnd(head2,8);
        insertEnd(head2,9);
        insertEnd(head2,7);

        ListNode node = addTwoNumbers(head1, head2);
        System.out.println("Result : "+fromNode(node));
    }

    private static ListNode createNode(int val){
        return new ListNode(val);
    }

    private static void insertEnd(ListNode head, int val){
        if(head == null){
            return;
        }

        ListNode newNode = new ListNode(val);
        while(head.next!=null){
            head = head.next;
        }
        head.next = newNode;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        String addResult = fromNode(l1).add(fromNode(l2)).toString();
        for(int i = addResult.length() - 1;i>=0;i--){
            insertEnd(head, Character.getNumericValue(addResult.charAt(i)));
        }
        return head.next != null ? head.next : head;
    }

    private static BigInteger fromNode(ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();
        while(listNode!=null){
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
        }
        return new BigInteger(reverse(stringBuilder.toString()));
    }

    private static String reverse(String val){
        String reverse = "";
        for(int i = val.length() - 1;i>=0;i--){
            reverse += val.charAt(i);
        }
        return reverse;
    }
}
