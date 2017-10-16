package com.niuKeSecondTime;

/**
 * Created by zhzy on 2017/10/16.
 */
public class 链表中环的入口节点 {

    /**
     10.16二刷
     先找到环的长度
     找环的长度是用快慢指针，当快慢指针相遇，即找到了环
     找到了环之后就是求入口节点了，找入口节点也是设置快慢指针，快指针先走环长度的距离，然后慢指针才开始走
     二者相遇的地方即为环的入口节点
     */

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode first = pHead;
        ListNode second = pHead;

        int loopLength = GetNodeOfLoopLength(pHead);
        if(loopLength == -1){
            return null;
        }

        while(loopLength-- > 0){
            first = first.next;
        }

        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public int GetNodeOfLoopLength(ListNode pHead){

        ListNode slow = pHead;
        ListNode fast = pHead;

        while((slow.next!=null) && (fast.next.next!=null) && (slow.next != fast.next.next)){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next == null || fast.next.next == null){
            return -1;
        }
        slow = slow.next;
        fast = slow;
        int len = 1;
        while(slow.next != fast){
            slow = slow.next;
            len ++;
        }
        return len;
    }
}
