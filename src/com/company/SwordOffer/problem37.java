package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/5/10.
 */
public class problem37 {

    public static void main(String[] args){
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(
                5
        );
        ListNode node1 = head1;
        ListNode node2 = head2;

        int[] a = {1,2,3,4};
        int[] b = {5,6,7};
        for(int i=1; i<a.length; i++){
            ListNode newnode = new ListNode(a[i]);
            node1.next = newnode;
            node1 = newnode;
        }
        node1.next = null;

        for(int i=1; i<b.length; i++){
            ListNode newnode = new ListNode(b[i]);
            node2.next = newnode;
            node2 = newnode;
        }
        node2.next = null;
        System.out.println(FindFirstCommonNode(head1, head2));


    }
        static class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if(pHead1 == null || pHead2 == null){
                return null;
            }
            ListNode node1 = pHead1;
            ListNode node2 = pHead2;

            int len1 = 1;
            int len2 = 1;

            while(node1.next != null){
                len1 ++;
                node1 = node1.next;
            }
            while(node2.next != null){
                len2 ++;
                node2 = node2.next;
            }
            node1 = pHead1;
            node2 = pHead2;
            if(len1 > len2){
                int gap = len1 - len2;
                while(gap > 0){
                    node1 = node1.next;
                    gap --;
                }
                while(node1 != null && node1.val != node2.val){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }else{
                int gap = len2 - len1;
                while(gap > 0){
                    node2 = node2.next;
                    gap --;
                }
                while(node1 != null && node1.val != node2.val){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }

        }



}
