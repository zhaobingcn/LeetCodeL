package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/5/14.
 */
public class problem57 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode first = pHead;
        ListNode last = pHead;

        int loopLength = NodeOfLoopLength(pHead);
        if(loopLength == -1){
            return null;
        }
        while(loopLength > 0){
            first = first.next;
            loopLength--;
        }

        while(first != last){
            first = first.next;
            last = last.next;
        }
        return first;
    }


    public int NodeOfLoopLength(ListNode pHead){

        int length = 0;

        ListNode fast = pHead;
        ListNode slow = pHead;

        while(true){
            if(slow.next ==null || fast.next.next==null){
                return -1;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        while (slow.next !=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            length ++;
            if(slow == fast){
                break;
            }
        }
        return length;
    }

}
