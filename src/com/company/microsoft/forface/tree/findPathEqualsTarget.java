package com.company.microsoft.forface.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhzy on 2017/4/13.
 */
public class findPathEqualsTarget {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> seList = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return seList;
        }
        Stack<Integer> path = new Stack<Integer>();
        int currentSum=0;
        findPath(root, target, path, currentSum, seList);
        return seList;
    }

    public void findPath(TreeNode root, int target, Stack<Integer> path, int currentSum, ArrayList<ArrayList<Integer>> seList){

        currentSum = root.val + currentSum;
        path.add(root.val);

        boolean isLeaf = root.left == null && root.right==null;

        if(currentSum == target && isLeaf){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int stack: path){
                list.add(stack);
            }
            seList.add(list);
        }

        if(root.left != null){
            findPath(root.left, target, path, currentSum, seList);
        }
        if(root.right != null){
            findPath(root.right, target, path, currentSum, seList);
        }

        path.pop();
    }

    class TreeNode{
            int val = 0;
            TreeNode left = null;
            TreeNode right = null;

            public TreeNode(int val) {
                this.val = val;

            }
    }
}
