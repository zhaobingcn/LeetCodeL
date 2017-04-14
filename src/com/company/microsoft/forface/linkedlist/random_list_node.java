package com.company.microsoft.forface.linkedlist;

/**
 * Created by zhzy on 2017/4/13.
 */
public class random_list_node {

    public RandomListNode Clone(RandomListNode pHead)
    {

        cloneNodes(pHead);
        connectRandomNode(pHead);
        return reconnectNodes(pHead);
    }

    public void cloneNodes(RandomListNode pHead){
        RandomListNode node = pHead;
        while(node.next != null){
            RandomListNode cloneNode = new RandomListNode(node.label);
            cloneNode.next = node.next;
            cloneNode.random = null;
            node.next = cloneNode;
            node = cloneNode.next;
        }
    }

    public void connectRandomNode(RandomListNode head){
        RandomListNode node = head;
        while(node != null){
            RandomListNode cloneNode = node.next;
            if(node.random != null){
                cloneNode.random = node.random.next;
            }
            node = cloneNode.next;
        }
    }

    public RandomListNode reconnectNodes(RandomListNode head){
        RandomListNode node = head;
        RandomListNode cloneHead = null;
        RandomListNode cloneNode = null;
        if(node != null){
            cloneNode = node.next;
            cloneHead = cloneNode;
            node.next = cloneNode.next;
            node = node.next;
        }
        while(node != null){
            cloneNode.next = node.next;
            cloneNode = cloneNode.next;
            node.next = cloneNode.next;
            node = node.next;
        }

        return cloneHead;
    }

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
