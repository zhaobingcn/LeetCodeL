package com.company.microsoft.forface.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhzy on 17-4-12.
 */
public class print_linkedlist_5 {

        public class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<ListNode> nodeStack = new Stack<ListNode>();
        while(listNode != null){
            nodeStack.add(listNode);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!nodeStack.empty()){
            list.add(nodeStack.pop().val);
        }
        return list;
    }
}
