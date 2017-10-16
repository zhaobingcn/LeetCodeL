package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

import java.util.Arrays;

/**
 * Created by zhzy on 2017/10/15.
 */
public class 重建二叉树 {
    /**
     10月15号二刷
     重建二叉树，主要利用递归的思想，重建左子树，重建右子树
     主要是找到左子树与右子树的表达范围
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length != in.length){
            return null;
        }
        if(pre.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);
        int rootIndex = 0;
        for(int i=0; i<in.length; i++){
            if(in[i] == pre[0]){
                rootIndex = i;
                break;
            }
        }
        int leftlen = rootIndex;
        int rightlen = in.length - rootIndex - 1;
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, 1+leftlen), Arrays.copyOfRange(in, 0, leftlen));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, 1+leftlen, pre.length), Arrays.copyOfRange(in, leftlen+1, in.length));

        return root;

    }
}
