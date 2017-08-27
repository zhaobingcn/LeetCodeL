package com.company.golden;

/**
 * Created by zhzy on 2017/8/24.
 */
public class CloseNumber {


    public int[] getCloseNumber(int x) {
        // write code here
        int[] res = new int[2];
        res[0] = getPrev(x);
        res[1] = getNext(x);
        return res;
    }

    public int getNext(int x){
        int c0 = 0;
        int c1 = 0;
        int temp = x;

        while ((temp & 1) == 0 && temp !=0){
            c0 ++;
            temp >>= 1;
        }

        while((temp & 1) == 1){
            c1 ++;
            temp >>= 1;
        }

        if(c1 + c0 == 31 || c1 + c0 == 0){
            return 0;
        }

        int p = c0 + c1;
        x = x | (1 << p);
        x =  x & ~((1 << p) -1);
        x = x | (1 << (c1 - 1)) - 1;
        return x;
    }


    public int getPrev(int x){


        int c0 = 0;
        int c1 = 0;
        int temp = x;

        while((temp & 1)==1){
            c1 ++;
            temp = temp >> 1;
        }

        while ((temp & 1) == 0 && temp !=0){
            c0 ++;
            temp = temp >> 1;
        }

        int p = c0 + c1;
        x = x & (~0) << (p+1);
        int mask = (1 << (c1+1)) - 1;
        x = x | mask << (c0-1);
        return x;
    }
}
