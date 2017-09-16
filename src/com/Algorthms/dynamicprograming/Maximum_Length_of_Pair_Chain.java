package com.Algorthms.dynamicprograming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhzy on 2017/9/14.
 */
public class Maximum_Length_of_Pair_Chain {

    public static void main(String[] args) {

    }

    public int findLongestChain(int[][] pairs) {

        int len = pairs.length;

        Arrays.sort(pairs, 0, len, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0] - o2[0];
            }
        });

        int dp[] = new int[len + 1];

        int all_max = Integer.MIN_VALUE;

        for (int i=0; i<len; i++){
            int max = Integer.MIN_VALUE;
            for (int j=0; j<i; j++){
                if(pairs[j][1] < pairs[i][0]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
            if(dp[i] > all_max){
                all_max = dp[i];
            }
        }

        return all_max;
    }

}
