package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/9/15.
 */
public class Edit_Distince {
    public static void main(String[] args) {

        System.out.print(minDistance("a", "a"));

    }

    public static int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++){
            dp[i][0] = i;
        }
        for(int i=0; i<=n; i++){
            dp[0][i] = i;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
                }
            }
        }

        return dp[m][n];
    }
}
