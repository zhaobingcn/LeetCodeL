package com.company.quna;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zhzy on 2017/10/11.
 */
public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = getReverse(x);
        getLCS(x,y);
    }

    public static void getLCS(String x, String y){

        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();
        int[][] array = new int[x.length()+1][y.length()+1];

        for(int j = 0; j < array[0].length; j++){
            array[0][j] = 0;
        }
        for(int i = 0; i < array.length; i++){
            array[i][0] = 0;
        }

        for(int m = 1; m < array.length; m++){
            for(int n = 1; n < array[m].length; n++){
                if(s1[m - 1] == s2[n - 1]){
                    array[m][n] = array[m-1][n-1] + 1;
                }else{
                    array[m][n] = max(array[m -1][n], array[m][n -1]);
                }
            }
        }
        Stack stack = new Stack();
        int i = x.length() - 1;
        int j = y.length() - 1;

        while((i >= 0) && (j >= 0)){
            if(s1[i] == s2[j]){
                stack.push(s1[i]);
                i--;
                j--;
            }else{
                if(array[i+1][j] > array[i][j+1]){
                    j--;
                }else{
                    i--;
                }
            }
        }

        if(!stack.isEmpty()){
            System.out.println(stack.size());
        }
    }

    public static int max(int a, int b){
        return (a > b)? a : b;
    }

    public static String getReverse(String s){
        String[] strArray = s.split(" ");
        int len = strArray.length;
        String[] newArray = new String[len];
        for(int i=0; i<len; i++){
            newArray[i] = strArray[len-i-1];
        }
        StringBuffer result = new StringBuffer("");
        for(int i=0; i<len; i++){
            result.append(newArray[i]);
            if(i!=len-1){
                result.append(" ");
            }
        }
        return result.toString();
    }

}
