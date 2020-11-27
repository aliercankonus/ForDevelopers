package com.fordevelopers.svc;

public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);

        listNode1.next = listNode2;
        listNode2.next= listNode3;
        listNode3.next = listNode4;

        listNode5.next = listNode6;
        listNode6.next= listNode7;
        listNode7.next = listNode8;

        System.out.println(fromNode(listNode1));
        System.out.println(fromNode(listNode5));
        ListNode node = addTwoNumbers(listNode1, listNode5);
        System.out.println("Result : "+fromNode(node));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = fromNode(l1) + fromNode(l2);
        return fromInt(sum);
    }

    private static int fromNode(ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();
        while(listNode!=null){
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
        }
        int result = Integer.parseInt(stringBuilder.toString());
        return reverse(result);
    }

    private static ListNode fromInt(int val){
        int reverse  = 0;
        ListNode head = new ListNode();
        while(val>0){
            reverse = reverse*10 + val%10;
            val = val/10;
             ListNode node = new ListNode(reverse);
            head.next = node;
            head = node;
        }
        return head;
    }


    private static int reverse(int val){
        int reverse  = 0;
        while(val>0){
            reverse = reverse*10 + val%10;
            val = val/10;
        }
        return reverse;
    }
}
