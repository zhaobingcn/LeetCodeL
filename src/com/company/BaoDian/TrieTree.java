package com.company.BaoDian;

import java.sql.Array;
import java.util.Arrays;
import java.util.Vector;

/**
 * Created by zhzy on 2017/5/22.
 */
public class TrieTree {

    class TrieNode{
        Vector<String> bwords = new Vector<>();
        TrieNode next[] = new TrieNode[26];
        TrieNode(){
            for(int i=0; i<26; i++){
                next[i] = null;
            }
        }
    }

    int CmpChar(char c1, char c2){
        return (c1 - c2);
    }

    void InsertNode(TrieNode root, String wd){
        if(wd.length() == 0){
            return;
        }
        if(root == null){
            root = new TrieNode();
        }
        int i=0;
        char swd[] = wd.toCharArray();
        Arrays.sort(swd);
        TrieNode next = root;
        while(i < wd.length()){
            if(next.next[swd[i] - 'a'] == null){
                TrieNode nn = new TrieNode();
                next.next[swd[i] - 'a'] = nn;
            }
            next = next.next[swd[i] - 'a'];
            i++;
        }
        next.bwords.add(wd);
    }

    boolean SearchNode(TrieNode root, String wd){
        char swd[] = wd.toCharArray();

        Arrays.sort(swd);
        int i = 0;
        while (i < wd.length()){
            if(root.next[swd[i] - 'a'] != null){
                root = root.next[swd[i] - 'a'];
                i++;
            }else {
                break;
            }
        }

        if(i == wd.length()){
            for(int j=0; j<root.bwords.size(); j++){
                System.out.println(root.bwords.get(j));
            }
            return true;
        }
        return false;
    }

    public void findBrother(){
        TrieNode root = new TrieNode();
        InsertNode(root, "hehao");
        InsertNode(root, "haohe");
        InsertNode(root, "heoha");
        InsertNode(root, "aoheh");
        InsertNode(root, "ehhao");
        InsertNode(root, "asd");
        InsertNode(root, "dsa");
        InsertNode(root, "ads");
        SearchNode(root, "ads");
    }

    public static void main(String[] args){
        new TrieTree().findBrother();
    }
}
