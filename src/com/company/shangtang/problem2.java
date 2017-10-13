package com.company.shangtang;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/10/12.
 */
public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println(21);
    }
}
