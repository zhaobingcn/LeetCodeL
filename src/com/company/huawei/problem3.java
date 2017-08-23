package com.company.huawei;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/16.
 */
public class problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(findMatch(a, b));
    }

    static int findMatch(String number0, String number1){

        int len = number0.length();
        char[] array0 = number0.toCharArray();
        char[] array1 = number1.toCharArray();

        int max = 0;
        int count = 0;
        boolean flag = false;
        for(int i=0; i< len; i++){
            if(array0[i] == array1[i]){
                flag = true;
            }else{
                flag = false;
            }
            if(flag){
                ++count;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        if(max == 1){
            max = 0;
        }
        return max;
    }
}
