package com.company.middle;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/5.
 */

/**
 * G(n) = F(1) + F(2) + .....+ F(n)
 * F(i) = G(i-1)*G(n-1)
 * G(n) = G(0)*G(n-1) + G(1)*G(n-2) + ..... + G(n-1)(0)
 *
 */
public class unique_binary_search_tree_96 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numTrees(n));

    }

    static int numTrees(int n) {

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }


}
