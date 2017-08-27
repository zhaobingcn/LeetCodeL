package com.company.didi;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/26.
 */
public class problem2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        int len = input.length;
        int num[] = new int[len+1];

        for(int i=0; i<len; i++){
            num[i] = Integer.valueOf(input[i]);
        }

//        findk(n, num, 0, num.length-1);
        System.out.print(findk(num, n));
    }
//    private static int partition(int[] L, int low, int high) {
//        int temp = L[low];
//        int pt = L[low]; // 哨兵
//        while (low != high) {
//            while (low < high && L[high] <= pt)
//                high--;
//            L[low] = L[high];
//
//            while (low < high && L[low] >= pt)
//                low++;
//            L[high] = L[low];
//        }
//
//        L[low] = temp;
//        return low;
//    }
//
//    public static void findk(int k, int[] L, int low, int high) {
//        int temp;
//        temp = partition(L, low, high);
//        if (temp == k - 1) {
//            System.out.println(L[temp]);
//        } else if (temp > k - 1)
//            findk(k, L, low, temp - 1);
//        else
//            findk(k, L, temp + 1, high);
//
//    }

    static int partition(int[] seq, int low, int high){
        int temp = seq[low];

        while (low != high){

            while (low < high && seq[high] <= temp){
                high--;
            }
            seq[low] = seq[high];
            while (low < high && seq[low] >= temp){
                low++;
            }
            seq[high] = seq[low];
        }

        seq[low] = temp;
        return low;
    }

    static int findk(int[] seq, int k){
        int low = 0;
        int high = seq.length-1;

        int find = partition(seq, low, high);

        while (find != k-1){

            if(find > k-1){
                high = find -1;
            }
            if(find < k-1){
                low = find +1;
            }

            find = partition(seq, low, high);
        }
        return seq[find];
    }
}