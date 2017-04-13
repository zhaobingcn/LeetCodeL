package com.company.microsoft.forface.linkedlist;

/**
 * Created by zhzy on 2017/4/13.
 */
public class reversedLinkedList {

    public static void main(String[] args){
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;
        ListNode head = ReverseList(p1);
        while(head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode p2 = head.next;
        ListNode p1 = head;
        p1.next = null;
        ListNode p3 = null;

        while(p2.next != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        p2.next = p1;
        return p2;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
