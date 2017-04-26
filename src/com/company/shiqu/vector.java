package com.company.shiqu;


import java.util.Arrays;

/**
 * Created by zhzy on 2017/4/25.
 */
public class vector {

    public static void main(String[] args){

        int[] a = {3, -5, 1 };
        int[] b = {-2, 1, 4};

        System.out.println(countMin(a,b));

    }

    public  static int countMin(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int i=0; i<a.length; i++){
            sum = sum + a[i] * b[a.length-1-i];
        }
        return sum;
    }
}
