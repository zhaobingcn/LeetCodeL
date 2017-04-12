package com.company.renren;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/9.
 */
public class problem1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int num = scanner.nextInt();
        int seq[] = new int[num];
        for(int i=0; i<num; i++){
            seq[i] = scanner.nextInt();
        }
        Arrays.sort(seq);
        int maxLen = 0;
        boolean flag =true;
        for(int i=1; i<=seq[0]; i++){
            flag = true;
            for(int j=0; j<num; j++){
                if(seq[j] % i==0){
                    continue;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                maxLen = Math.max(i, maxLen);
            }

        }

        System.out.println(maxLen);
    }
}
