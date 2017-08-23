package com.company.niuke;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/19.
 * 丛哲  树的高度
 */

public class TreeHeight {

    public static void main(String[] args) {

        int n;
        int maxHeight = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int countNode[] = new int[n*2];

        HashMap<Integer, Integer> tree = new HashMap<>(n*2);
        tree.put(0, 1);

        for(int i=0; i<n-1; i++){
            int parent = scanner.nextInt();

            countNode[parent]++;
            if(countNode[parent] > 2){
                continue;
            }if(tree.get(parent) == null){
                continue;
            }

            int son = scanner.nextInt();
            int height = tree.get(parent) + 1;
            if(height > maxHeight){
                maxHeight = height;
            }
            tree.put(son, height);
        }

        System.out.println(maxHeight);

    }
}
