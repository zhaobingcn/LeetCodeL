package com.Algorthms.dynamicprograming;

import java.util.List;

/**
 * Created by zhzy on 2017/9/16.
 */
public class Triangle {

    public static void main(String[] args) {
        return;
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();

        int[][] dp = new int[size + 1][size + 1];

        for(int i=0; i<triangle.get(size-1).size(); i++){
            dp[size-1][i] = triangle.get(size-1).get(i);
        }

        for(int i = size-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}
