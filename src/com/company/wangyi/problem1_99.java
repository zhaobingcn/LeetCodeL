package com.company.wangyi;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/9/9.
 */
public class problem1_99 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int input[][] = new int[1000][3];

        unit output[] = new unit[1000];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                input[i][j] = scanner.nextInt();
            }
        }


        for(int i=0; i<n; i++){
            unit a = new unit(input[i][1], new HashSet<>());
            for(int j=0; j<n && j!=i; j++){
                if(input[j][2] == input[i][2] && input[j][1] != input[i][1]){
                    a.values.add(input[j][1]);
                }
            }
        }



    }


    static class unit{
        int key;
        HashSet<Integer> values;

        public unit(int key, HashSet<Integer> values){
            this.key = key;
            this.values = values;
        }

        public unit(){
        }
    }






}
