package com.company.didi;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/26.
 */
public class problem1 {


    //数学方法解决
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int len = input.length;
        int num[] = new int[len+1];

        for(int i=0; i<len; i++){
            num[i] = Integer.valueOf(input[i]);
        }

        System.out.println(countMaxSeq(num, len));

    }

//    static int countMaxSeq(int seq[], int length){
//        int sum = 0;
//        int max = seq[0];
//        for(int i=0; i<length; i++){
//            if(sum < 0){
//                sum = seq[i];
//            }else {
//                sum = sum + seq[i];
//            }
//            if(sum > max){
//                max = sum;
//            }
//        }
//        return max;
//    }

    /**
     * 用动态规划的思路解决，以当前数字为结尾的最长子序列是和之前的最长子序列之间的关系是
     * 如果之前的大于0，则加上当前的，如果小于0则从当前开始
     */

    static int countMaxSeq(int seq[], int length){

        int sum[] = new int[length + 1];
        int max = 0;
        for (int i=1; i<=length; i++){
            if(sum[i-1] < 0){
                sum[i] = seq[i-1];
            }else {
                sum[i] = sum[i-1] + seq[i-1];
            }
            if(sum[i] > max){
                max = sum[i];
            }
        }
        return max;
    }

}


