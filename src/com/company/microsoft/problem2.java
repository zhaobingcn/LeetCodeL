package com.company.microsoft;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/3.
 */
public class problem2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        int depath[] = new int[M];
        for(int i=0; i<M; i++){
            depath[i] = input.nextInt();
        }
        int nodes[][] = new int[M][];
        for(int i=0; i<M; i++){
            nodes[i] = new int[depath[i]];
            for(int j=0; j<depath[i]; j++){
                nodes[i][j] = input.nextInt();
            }
        }

        int leaves[] = new int[K];
        for(int i=0; i<K; i++){
            leaves[i] = input.nextInt();
        }
        int rel[][] = new int[N+1][N+1];
        for(int i=0; i<K; i++){
            for(int j=0; j<K; j++){
                rel[leaves[i]][leaves[j]] = input.nextInt();
            }
        }

        int parents[] = findParents(nodes, leaves, rel, depath, N, M, K);
        for(int i=0; i<parents.length; i++){
            System.out.print(parents[i]);
        }
        System.out.println();
        for(int i=0; i<N+1; i++){
            for(int j=0; j<N+1; j++){
                System.out.print(rel[i][j]);
            }
            System.out.println();
        }

    }
    static int[] findParents(int nodes[][], int leaves[], int rel[][], int depath[], int N, int M, int K){

        ArrayList<Integer> allHaveRelNodes = new ArrayList<>();
        for(int i=0; i<K ;i++){
            allHaveRelNodes.add(leaves[i]);
        }
        int parents[] = new int[N+1];
        boolean isLeaf[] = new boolean[N+1];
        for(int i=0; i<K; i++){
            isLeaf[leaves[i]] = true;
        }
        int nowLevel = M-1;
        int parentLevel = M-2;

        while(parentLevel >= 0) {
            int parentIndex = 0;
            for (int nodeIndex = 0; nodeIndex < depath[nowLevel]; nodeIndex++) {
                while (parentIndex < depath[parentLevel] && isLeaf[nodes[parentLevel][parentIndex]]) {
                    parentIndex++;
                }
                if(parentIndex >= depath[parentLevel]){
                    break;
                }
                parents[nodes[nowLevel][nodeIndex]] = nodes[parentLevel][parentIndex];
                /**
                 * 更新距离 需要继续想
                 */

                for (int i = 0; i < depath[parentLevel]; i++) {
                    if(isLeaf[nodes[parentLevel][i]]){
                        rel[nodes[parentLevel][i]][nodes[parentLevel][parentIndex]] = Math.abs(rel[nodes[nowLevel][nodeIndex]][nodes[parentLevel][i]] - 1);
                        rel[nodes[parentLevel][parentIndex]][nodes[parentLevel][i]] = Math.abs(rel[nodes[nowLevel][nodeIndex]][nodes[parentLevel][i]] - 1);

                    }
                }


                allHaveRelNodes.add(nodes[parentLevel][parentIndex]);
                isLeaf[nodes[parentLevel][parentIndex]] = true;

                if (nodeIndex + 1 < depath[nowLevel] && rel[nodes[nowLevel][nodeIndex]][nodes[nowLevel][nodeIndex + 1]] > 1) {
                    parentIndex++;
                }
            }
            parentLevel--;
            nowLevel--;
        }
        return parents;
    }


}
