package com.company.SwordOffer;

import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by zhzy on 2017/8/25.
 */
public class TreePrint {

//
//        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
//
//            ArrayList<ArrayList<Integer>> treeList = new ArrayList<>();
//            Queue<TreeNode> treeNodeQueue = new ArrayDeque<>();
//            treeNodeQueue.add(pRoot);
//
//            while(!treeNodeQueue.isEmpty()){
//                TreeNode treeNode = treeNodeQueue.poll();
//
//                if(treeNode.left != null){
//                    treeNodeQueue.add(treeNode.left);
//                }if(treeNode.right != null){
//                    treeNodeQueue.add(treeNode.right);
//                }
//            }
//        }
public static void main(String[] args) throws UnsupportedEncodingException {
    Integer a= Integer.valueOf(-128);
    Integer b=Integer.valueOf("-128");
    Integer c=-128;
    Integer d=new Integer(-128);
    System.out.print(a==b);
    System.out.print(a==c);
    System.out.print(a==d);

    Integer w=Integer.valueOf(128);
    Integer x=Integer.valueOf("128");
    Integer y=128;
    Integer z= new Integer(128);
    System.out.print(w==x);
    System.out.print(w==y);
    System.out.print(w==z);

    Integer i=1;
    Integer j=2;
    Integer k=3;
    System.out.println(k==(i+j));
}

}
