package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/9/15.
 */
public class Minimum_Path_Sum {

    public static void main(String[] args) {
        System.out.print(Math.min(1,1));
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] pathGrid = new int[m+1][n+1];

        for(int i=1; i<=m; i++){

            for(int j=1; j<=n; j++){
                pathGrid[i][j] = Math.min(pathGrid[i-1][j], pathGrid[i][j-1]) + grid[i-1][j-1];
            }
        }
        return pathGrid[m][n];

    }
}
