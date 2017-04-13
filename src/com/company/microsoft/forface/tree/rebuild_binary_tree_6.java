package com.company.microsoft.forface.tree;

import java.util.Arrays;

/**
 * Created by zhzy on 17-4-12.
 */
public class rebuild_binary_tree_6 {

    public static void main(String[] args) throws Exception{
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode root = reConstructBinaryTree(pre, in);
    }

    static class  TreeNode{
        TreeNode left;
        TreeNode right;
        int val = 0;

        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) throws Exception{

        if(pre == null || in == null){
            return null;
        }
        if(pre.length != in.length){
            System.out.println("输入错误，长度不一样");
        }
        TreeNode root = null;
        for(int i=0; i<in.length; i++){
            if(in[i] == pre[0]){
                root = new TreeNode(pre[0]);
//                System.out.println(root.val);
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
            }
        }
        return root;
    }
}
