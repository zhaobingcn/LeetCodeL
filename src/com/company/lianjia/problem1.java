package com.company.lianjia;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhzy on 2017/9/22.
 */
public class problem1 {


    public static void main(String[] args) {

    }

    void getNodePath(TreeNode root, TreeNode target, List<TreeNode> tmpList, List<TreeNode> path){
        if(root == null || root == target){
            return;
        }
        tmpList.add(root);
        List<TreeNode> children = root.childern;
        for (TreeNode node : children){
            if(node == target){
                path.addAll(tmpList);
                break;
            }
            getNodePath(node, target, tmpList, path);
        }

        tmpList.remove(tmpList.size() - 1);
    }

    class TreeNode{
        int val;
        List<TreeNode> childern = new ArrayList<>();

        public TreeNode(int val){
            this.val = val;
        }

    }


}


