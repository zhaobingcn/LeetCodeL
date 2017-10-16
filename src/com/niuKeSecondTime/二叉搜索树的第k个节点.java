package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

/**
 * Created by zhzy on 2017/10/16.
 */
public class 二叉搜索树的第k个节点 {

    /**
     中序遍历二叉搜索树即是二叉搜索树从小到大的遍历顺序
     */
    TreeNode KthNode(TreeNode pRoot, int k)
    {

        if(pRoot == null || k==0){
            return null;
        }
        int a[] = new int[1];
        a[0] = 1;
        return KthNodeCore(pRoot, k, a);
    }

    TreeNode KthNodeCore(TreeNode pRoot, int k, int a[]){

        TreeNode node = null;

        //开始中序遍历，先遍历左子树
        if(pRoot.left != null){
            node = KthNodeCore(pRoot.left, k, a);
        }

        //判断是否找到了，如果找到了则node不为null，判断当前是不是第k个，是的话则将pRoot赋值给node
        //这是一个短路操作
        if(node == null){
            if(a[0] == k){
                node = pRoot;
            }
            a[0] ++;
        }
        //这仍然是一个短路操作
        if(node == null && pRoot.right != null){
            node =  KthNodeCore(pRoot.right, k, a);
        }

        return node;
    }


}
