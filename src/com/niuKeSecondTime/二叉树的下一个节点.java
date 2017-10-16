package com.niuKeSecondTime;

/**
 * Created by zhzy on 2017/10/15.
 */
public class 二叉树的下一个节点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode == null){
            return null;
        }

        TreeLinkNode res = null;
        /**
         如果该节点的右子树存在，则下一个节点是该节点的右子树的最左节点
         */
        if(pNode.right != null){
            res = pNode.right;
            while(res.left != null){
                res = res.left;
            }
        }else{
            /**
             * 其他情况，如果是右子树，则找他所在最大左子树的第一个父节点
             * 如果是左子树，则就是他的父节点
             */
            while(pNode.next!=null && pNode.next.right == pNode){
                pNode = pNode.next;
            }
            res = pNode.next;

        }
        return res;

    }

    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
