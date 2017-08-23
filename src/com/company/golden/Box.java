package com.company.golden;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhzy on 2017/8/23.
 */
public class Box {

    public static void main(String[] args) {

    }


    public int getHeight(int[] w, int[] l, int[] h, int n) {
        // write code here

        BoxStruct boxes[] = new BoxStruct[n];
        for(int i=0; i<n; i++){
            BoxStruct boxStruct = new BoxStruct(w[i], l[i], h[i]);
            boxes[i] = boxStruct;
        }

        Arrays.sort(boxes, new Comparator<BoxStruct>() {
            @Override
            public int compare(BoxStruct o1, BoxStruct o2) {
                return o2.wi - o1.wi;
            }
        });

        int dp[] = new int[n];
//        dp[0] =

        return 0;
    }

}


class BoxStruct{
    int wi;
    int li;
    int hi;

    public BoxStruct(int wi, int li, int hi){
        this.wi = wi;
        this.li = li;
        this.hi = hi;
    }
}
