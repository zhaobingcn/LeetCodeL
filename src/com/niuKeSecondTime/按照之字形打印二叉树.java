package com.niuKeSecondTime;

import com.company.SwordOffer.TreeNode;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/10/16.
 */
public class 按照之字形打印二叉树 {
    /**
     打印成之字形和按行打印差不多，只是在打印的时候用一个boolean进行奇偶跳转一下
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

        boolean tag = true;
        for(int i=0; i<res.size(); i++){
            ArrayList<Integer> r = new ArrayList<>();
            if(tag){
                for(int j=0; j<res.get(i).size(); j++){
                    r.add(res.get(i).get(j).val);
                }
                tag = false;
            }else {
                for(int j=res.get(i).size()-1; j>=0; j--){
                    r.add(res.get(i).get(j).val);
                }
                tag = true;
            }

            rr.add(r);
        }
        return rr;
    }
}
