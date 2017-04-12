package com.company.microsoft.forface.array;

import java.util.Scanner;

/**
 * Created by zhzy on 17-4-12.
 */
public class Array_Search_3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] a = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println(searchHit(a, x, y, 20));

    }

    public static boolean searchHit(int a[][], int x, int y, int num){
        int row = 0;
        int column = y-1;
        while(row >=0 && row < x && column >=0 && column < y){
            if(num == a[row][column]){
                return true;
            }else if(num > a[row][column]){
                row ++;
            }else if(num < a[row][column]){
                column --;
            }
        }
        return false;
    }
}
