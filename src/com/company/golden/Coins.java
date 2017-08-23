package com.company.golden;

/**
 * Created by zhzy on 2017/8/22.
 */
public class Coins {
    public static int countWays(int n) {
        // write code here

//        int coins[] = {1, 5, 10, 25};
//
//        int[][] dp = new int[4+1][n+1];
//
//        for(int i=0; i<=4; i++){
//            dp[i][0] = 1;
//        }
//
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=n; j++){
//
//                for(int k=0; k<= j/coins[i-1]; k++){
//                    dp[i][j] = (dp[i][j] + dp[i-1][j - k*coins[i-1]])%1000000007;
//                }
//
//            }
//        }
//    return dp[4][n];
        int coins[] = {1, 5, 10, 25};
        int dp[] = new int[100000 + 1];
        dp[0] = 1;
        for(int i=0; i<4; i++){
            for(int j=coins[i]; j<=n; j++){
                dp[j] = (dp[j] + dp[j-coins[i]]) % 1000000007;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countWays(20));
    }
}
