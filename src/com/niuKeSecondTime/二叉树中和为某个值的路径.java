package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhzy on 2017/10/17.
 */
public class 二叉树中和为某个值的路径 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        TreeNode left = root.left;
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);

        二叉树中和为某个值的路径 a = new 二叉树中和为某个值的路径();
//        a.traversal(root);
        System.out.println(a.FindPath(root, 22));
    }

    /**
     10.17二刷
     开始之前的想法，首先需要用一个stack存放路径,使用先序遍历 想法错误
     先序遍历不可以   必须要用后序遍历

     注意必须是叶子节点才可以判定currentSum
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        if(root == null){
            return paths;
        }
        Stack<Integer> path = new Stack<>();
        int currentSum = 0;
        FindPath(root, path, target, currentSum, paths);
        return paths;
    }

    public void FindPath(TreeNode root, Stack<Integer> path, int target, int currentSum, ArrayList<ArrayList<Integer>> paths){
        currentSum = currentSum + root.val;
        path.push(root.val);

        boolean isLeaf = root.left == null && root.right == null;

        if(currentSum == target && isLeaf){
            ArrayList<Integer> list = new ArrayList<>();
            for(int s:path){
                list.add(s);
            }
            paths.add(list);
        }

        if(root.left != null){
            FindPath(root.left, path, target, currentSum, paths);
        }
        if(root.right != null){
            FindPath(root.right, path, target, currentSum, paths);
        }

        path.pop();

    }

//    public void traversal(TreeNode root){;
//
//        Stack<TreeNode> stack = new Stack<>();
//        while(root != null || !stack.isEmpty()){
//
//            while (root != null){
//                stack.push(root);
//                root = root.left;
//            }
//
//            if(!stack.isEmpty()){
//                root = stack.peek();
//                System.out.println(root.val);
//                stack.pop();
//                root = root.right;
//            }
//        }
//
//    }
}
