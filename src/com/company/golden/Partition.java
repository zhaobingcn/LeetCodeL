package com.company.golden;

import com.company.SwordOffer.ListNode;

/**
 * Created by zhzy on 2017/5/15.
 */
public class Partition {

    public static  void  main(String[] args){
        ListNode head = new ListNode(6);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(8);
        head.next = p2;
        p2.next = p3;
        p3.next = null;

        ListNode result = partition(head, 9);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode pHead1 = null;
        ListNode pHead2 = null;
        ListNode curNode1 = pHead1;
        ListNode curNode2 = pHead2;

        while(pHead != null){
            if(pHead.val < x){
                if(curNode1 == null){
                    curNode1 = pHead;
                    pHead1 = curNode1;
                }else{
                    curNode1.next = pHead;
                    curNode1 = curNode1.next;
                }
                pHead = pHead.next;
                curNode1.next = null;
            } else{
                if(curNode2 == null){
                    curNode2 = pHead;
                    pHead2 = curNode2;
                }else{
                    curNode2.next = pHead;
                    curNode2 = curNode2.next;
                }
                pHead = pHead.next;
                curNode2.next = null;
            }
        }
        curNode1.next = pHead2;
        return pHead1;
    }
}
