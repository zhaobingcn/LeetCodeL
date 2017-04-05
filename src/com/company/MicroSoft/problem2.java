package com.company.MicroSoft;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/2.
 */
public class problem2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int depathCount[] = new int[m];
        int nodes[][] = new int[m][];
        for(int i=0; i<m; i++){
            depathCount[i] = input.nextInt();
            nodes[i] = new int[depathCount[i]];
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<depathCount[i]; j++){
                nodes[i][j] = input.nextInt();
            }
        }

        int leaf[] = new int[k];
        for(int i=0; i<k; i++){
            leaf[i] = input.nextInt();
        }
    }

    static int[] findParents(){

        return null;
    }
}
