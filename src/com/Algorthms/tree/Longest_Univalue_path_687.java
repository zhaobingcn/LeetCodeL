package com.Algorthms.tree;

import com.company.SwordOffer.TreeNode;

/**
 * Created by zhzy on 2017/10/23.
 */
public class Longest_Univalue_path_687 {

    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        longestpath(root);
        return ans;
    }

    int longestpath(TreeNode root){
        if(root == null) return 0;
        int left = longestpath(root.left);
        int right = longestpath(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if(root.left != null && root.left.val == root.val){
            arrowLeft = left + 1;
        }
        if(root.right != null && root.right.val == root.val){
            arrowRight = right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

}
