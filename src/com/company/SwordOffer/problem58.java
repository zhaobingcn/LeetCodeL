package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/5/14.
 */
public class problem58 {

    public static void main(String[] args){

        ListNode newNode = new ListNode(1);
        ListNode head = newNode;
        newNode.next = new ListNode(2);
        newNode = newNode.next;
        newNode.next = new ListNode(2);
        newNode = newNode.next;
        newNode.next = new ListNode(5);
        newNode = newNode.next;
        newNode.next = null;


    }

    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode prevNode = null;
        ListNode curNode = pHead;

        while(curNode.next != null){
            boolean flag = true;
            while(curNode.next!=null && curNode.val == curNode.next.val){
                curNode.next = curNode.next.next;
                flag = false;
            }
            if(flag == false){
                if(prevNode ==null){
                    pHead = curNode.next;
                }else{
                    curNode = curNode.next;
                    prevNode.next = prevNode.next.next;
                }
            }else {
                prevNode = curNode;
                curNode = curNode.next;
            }
        }
        return pHead;
    }

//    public ListNode deleteDuplication(ListNode pHead)
//    {
//        if(pHead == null){
//            return null;
//        }
//        ListNode prevNode = null;
//        ListNode curNode = pHead;
//
//        while (curNode != null){
//
//        }
//        return pHead;
//    }
}
