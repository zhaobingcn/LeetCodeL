package com.company.golden;

/**
 * Created by zhzy on 2017/8/20.
 */
public class BinInsert {

    public int binInsert(int n, int m, int j, int i) {
        // write code here
        int insertNum = m << j;

        int sufNum = n & (0xFFFF << j) & (0xFFFF >> (32-i));

        int toBeInsertNum = n - sufNum;

        int result = insertNum + toBeInsertNum;

        return result;
    }
}
