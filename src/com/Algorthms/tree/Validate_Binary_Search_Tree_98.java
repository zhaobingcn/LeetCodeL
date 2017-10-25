package com.Algorthms.tree;

import com.company.SwordOffer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhzy on 2017/10/23.
 */
public class Validate_Binary_Search_Tree_98 {
    public boolean isValidBST(TreeNode root) {
        List<Long> ans = new ArrayList<>();
        if(root == null){
            return true;
        }
        traversal(root, ans);
        if(ans.size() == 1){
            return true;
        }else{
            for(int i=1; i<ans.size(); i++){
                if(ans.get(i) - ans.get(i-1) <= 0){
                    return false;
                }
            }
        }
        return true;

    }

    void traversal(TreeNode root, List<Long> ans){
        if(root.left != null){
            traversal(root.left, ans);
        }
        ans.add((long)root.val);
        if(root.right != null){
            traversal(root.right, ans);
        }
    }
}
