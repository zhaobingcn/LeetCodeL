package com.Algorthms;

import java.util.*;

/**
 * Created by zhzy on 2017/10/10.
 */
public class LianJIa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int count[] = new int[n];
        for(int i=0; i<n; i++){
            count[i] = scanner.nextInt();
        }

        int rope[][] = new int[m][2];

        for(int i=0; i<m; i++){
            rope[i][0] = scanner.nextInt();
            rope[i][1] = scanner.nextInt();
        }

        System.out.println(MinCount(n, m, count, rope));

    }

    public static int MinCount(int n, int m, int[] count, int[][] rope){
        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int gap = 1; gap <= n-1; gap ++){
            for(int i=1; i+gap <= n; i++){

                int min = Integer.MAX_VALUE;
                int end = i+gap;
                int start = i;
                for(int j = start; j <= end; j++){
                    int nowSum = 0;
                    if(j == start){
                        nowSum = Count(j, count, m, rope, start, end) + dp[j+1][end];
                    }else if(j == end){
                        nowSum = Count(j, count, m, rope, start, end) + dp[start][end-1];
                    }else {
                        nowSum = Count(j, count, m, rope, start, end) + dp[start][j-1] + dp[j+1][end];
                    }
                    if(nowSum < min){
                        min = nowSum;
                    }
                }
                dp[start][end] = min;
            }
        }
        return dp[1][n];
    }

    public static int Count(int a,int[] count, int m, int[][] rope, int start, int end){

        int num = 0;
        for(int i=0; i<m; i++){
            if(rope[i][0] == a){
                num = num + count[rope[i][1] - 1];
                rope[i][0] = 0;
                rope[i][1] = 0;
            }
            if(rope[i][1] == a){
                num = num + count[rope[i][0] - 1];
                rope[i][0] = 0;
                rope[i][1] = 0;
            }
        }
        return num;
    }
}