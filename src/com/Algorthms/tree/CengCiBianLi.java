package com.Algorthms.tree;

import com.company.SwordOffer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhzy on 2017/10/24.
 */
public class CengCiBianLi {
    static List<List<Integer>> a;

    public static void main(String[] args) {
        a = new ArrayList<>();
        for(int i=0; i<3; i++){
            a.add(new ArrayList<Integer>());
        }
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        traversal(root, 0);

        for(int i=0; i<3; i++){
            System.out.println();
            for(int j=0; j<a.get(i).size(); j++){
                System.out.print(a.get(i).get(j) + " ");
            }
        }

    }

    static void traversal(TreeNode root, int i){

        a.get(i).add(root.val);

        if(root.left != null){
            traversal(root.left, i+1);
        }
        if(root.right != null){
            traversal(root.right, i+1);
        }
    }
}
