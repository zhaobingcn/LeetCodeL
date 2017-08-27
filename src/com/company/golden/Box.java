package com.company.golden;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhzy on 2017/8/23.
 */
public class Box {

    public static void main(String[] args) {

        int w[] = {2768,542,832,844,2920,587,72,1724,447,809,672,2393,1235,2775,273,1165,1809,111,1263,2751,1068,2507,453,65,
                2338,1103,1093,2327,1995,1125,2340,1133,2123,1692,2215,140,1822,2144,2240,2916,1860,2226,698,846,2177,295};
        int l[] = {821,2593,1581,2891,2853,1662,2747,2856,2178,865,383,523,809,998,312,237,1871,2730,823,676,568,1839,2063,
                1651,2704,2113,1316,2892,1874,270,1112,869,1099,1876,371,2298,2070,1514,2916,165,1043,1355,2852,1319,1979,1961};
        int h[] = {771,2963,1599,1910,2317,2884,872,2463,949,341,2718,1500,1071,539,2463,1355,104,2989,1240,240,981,0,2172,3011,
                621,681,1178,2518,2766,615,460,2399,2443,2894,799,1726,2454,2099,2279,2911,2018,426,2896,224,2663,351};

        int n = 46;

        Box box = new Box();

        System.out.println(box.getHeight(w,l,h,n));

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
                return o1.wi - o2.wi;
            }
        });

//        int MaxHeightToSelf[] = new int[n + 2];
//
//        int res = 0;
//        for(int i=1; i<=n; i++){
//            int max = 0;
//            for(int j=1; j<i; j++){
//                if(boxes[j-1].wi < boxes[i-1].wi && boxes[j-1].li < boxes[i-1].li){
//                    if(max < MaxHeightToSelf[j]){
//                        max = MaxHeightToSelf[j];
//                    }
//                }
//            }
//            MaxHeightToSelf[i] = max + boxes[i-1].hi;
//            res = Math.max(res, MaxHeightToSelf[i]);
//        }
//        return res;

        int MaxHeightToSelf[] = new int[n + 1];

        MaxHeightToSelf[0] = boxes[0].hi;
        int res = 0;
        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(boxes[j].wi < boxes[i].wi && boxes[j].li < boxes[i].li){
                    if(max < MaxHeightToSelf[j]){
                        max = MaxHeightToSelf[j];
                    }
                }
            }
            MaxHeightToSelf[i] = max + boxes[i].hi;
            res = Math.max(res, MaxHeightToSelf[i]);
        }
        return res;
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
