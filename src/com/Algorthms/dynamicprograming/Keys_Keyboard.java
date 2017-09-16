package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/9/14.
 */

import java.util.Arrays;

/**
 *二维dp 分别表示屏幕上有多少个A  缓存中有多少个A
 */
public class Keys_Keyboard {

    public static void main(String[] args) {

        System.out.println(minSteps(15));
    }

    static int minSteps(int n){

        if(n == 1) return 0;

        /**
         * 行代表屏幕上的，列代表缓存中的
         */
        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE - 10);
        }

        dp[1][1] = 1;

        for(int i=2; i<=n; i++){
            int min = Integer.MAX_VALUE - 10;

            for(int j=1; j<i; j++){
                dp[i][j] = Math.min(dp[i][j], dp[i-j][j] + 1);
                min = Math.min(dp[i][j], min);
            }
            dp[i][i] = min + 1;
        }

        int ret = Integer.MAX_VALUE - 10;
        for(int i=1; i<=n; i++){
            ret = Math.min(ret, dp[n][i]);
        }

        return ret;
    }


}
