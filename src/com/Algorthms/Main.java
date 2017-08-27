package com.Algorthms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double a[] = new double[n];
        for(int i=0; i<n; i++){
            a[i] = Double.valueOf(scanner.nextLine().toString());
        }

        System.out.println("yes");
    }
}
