package com.company.golden;

/**
 * Created by zhzy on 2017/8/23.
 */
public class Queens {
    public int nQueens(int n) {
        // write code here
        /**
         * n皇后问题的重点是要
         */
        int queens[] = new int[n];
        int count[] = {0};
        for(int i=0; i<n ;i++){
            queens[0] = i;
            getCount(queens, 0, count);
        }
        return count[0];
    }

    public void getCount(int queens[], int row, int count[]){
        if(row == queens.length){
            count[0] ++;
            return;
        }
        for(int i=0; i<queens.length; i++){
            if(Place(queens, i, row)){
                queens[row] = i;
                getCount(queens, row + 1, count);
            }
        }
    }

    //判断一个皇后插入的位置是否合理
    boolean Place(int queen[], int col, int row){
        //一个合理的皇后是行，列，斜线都没有在一条直线上的
        for(int i=0; i<row; i++){
            if(Math.abs(queen[i] - col) == Math.abs(i - row) || col == queen[i]){
                return false;
            }
        }
        return true;
    }
}
