package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

/**
 * Created by zhzy on 2017/10/16.
 */
public class 对称二叉树 {

    /**
     判断一颗二叉树是否是对称的，可以用递归的思想
     即判断以两个节点为根节点的两棵二叉树是否对称。对称位置即映射位置的两个节点值是否相等。

     按照剑指offer上解释的说法，判断二叉树是否对称即判断这棵二叉树的前序和对称前序遍历是否相等。
     */
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2){

        if(pRoot1 == null && pRoot2 == null){
            return true;
        }
        if(pRoot1 == null || pRoot2 == null){
            return false;
        }
        if(pRoot1.val != pRoot2.val){
            return false;
        }

        return isSymmetrical(pRoot1.left, pRoot2.right) &&
                isSymmetrical(pRoot1.right, pRoot2.left);
    }
}
