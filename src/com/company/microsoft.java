package com.company;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/3/31.
 */
public class microsoft {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int num = input.nextInt();
            while(num-- > 0) {
                int N = input.nextInt();
                int P = input.nextInt();
                int W = input.nextInt();
                int H = input.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = input.nextInt();
                }

                System.out.println("num");
                System.out.print(N + " " + P + " " + W + " " + H + "\n");
                for (int i = 0; i < N; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }


    public void getPages(int height, int weight, int size, int a[]){

    }
}
