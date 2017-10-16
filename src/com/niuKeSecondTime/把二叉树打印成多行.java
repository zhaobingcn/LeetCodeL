package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/10/15.
 */
public class 把二叉树打印成多行 {
    /**
     主要是用了两个二维的ArrayList一个用来存节点，一个用来存数字
     */
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rr = new ArrayList<>();
        if(pRoot == null){
            return rr;
        }

        ArrayList<ArrayList<TreeNode>> res = new ArrayList<>();

        ArrayList<TreeNode> list = new ArrayList<>();

        list.add(pRoot);
        res.add(list);

        while(list.size() > 0){
            ArrayList<TreeNode> newList = new ArrayList<>();
            TreeNode node = null;
            for(int i=0; i<list.size(); i++){
                node = list.get(i);
                if(node.left != null){
                    newList.add(node.left);
                }
                if(node.right != null){
                    newList.add(node.right);
                }
            }
            if(newList.size() == 0){
                break;
            }
            list = newList;
            res.add(list);
        }
        for(int i=0; i<res.size(); i++){
            ArrayList<Integer> r = new ArrayList<>();
            for(int j=0; j<res.get(i).size(); j++){
                r.add(res.get(i).get(j).val);
            }
            rr.add(r);
        }
        return rr;
    }
}
