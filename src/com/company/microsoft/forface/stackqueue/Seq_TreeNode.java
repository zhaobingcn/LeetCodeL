package com.company.microsoft.forface.stackqueue;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * Created by zhzy on 2017/4/13.
 */
public class Seq_TreeNode {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> printList = new ArrayList<Integer>();

        Queue<TreeNode> queue= new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            printList.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return printList;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
