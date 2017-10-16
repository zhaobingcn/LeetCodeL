package com.niuKeSecondTime;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhzy on 2017/10/15.
 */
public class 从头到尾打印链表 {

    /**
     从尾到头打印链表，主要是利用栈的特性，把链表存储在栈中，然后再出栈
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        if(listNode == null){
            return arrayList;
        }

        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while(!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }


    class ListNode {
             int val;
             ListNode next = null;
             ListNode(int val) {
                 this.val = val;
             }
         }


}
