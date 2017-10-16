package com.niuKeSecondTime;

/**
 * Created by zhzy on 2017/10/16.
 */
public class 删除链表中的重复节点 {

    /**
     * 主要有几点
     * 第一点是在头结点前再加一个头结点，为了应对，111112这种情况，1要彻底删完
     *
     * 二设置两个指针 pre 和 cur
     * 循环条件为cur != null
     * 分两种情况 当cur == cur.next   另一种是cur != cur.next
     * @param pHead
     * @return
     */

    public ListNode deleteDuplication(ListNode pHead)
    {

        if(pHead == null){
            return null;
        }

        ListNode head = new ListNode(0);
        head.next = pHead;

        ListNode pre = head;
        ListNode cur = pre.next;

        while(cur != null){
            if(cur.next != null){

                if(cur.val == cur.next.val){
                    while(cur.next != null && cur.val == cur.next.val){
                        cur.next = cur.next.next;
                    }
                    if(cur.next == null){
                        pre.next = cur.next;
                    }else{
                        pre.next = cur.next;
                        cur = pre.next;
                    }
                }
                else{
                    pre = cur;
                    cur = cur.next;
                }
            }else{
                break;
            }
        }
        return head.next;

    }
}
