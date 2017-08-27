package com.company.tencent;

import java.util.HashMap;

/**
 * Created by zhzy on 2017/4/25.
 */
public class max_zero_seqcence {


    /**
     * 和为0的最长连续子序列，证明他们的中间一段和为0
     * 那么如果我们求一个sum[]数组，如果存在和为0的子序列，sum数组中会出现值相同的情况
     * 因此该为题就转化为求sum数组中相同的两个数的最大距离
     * 特别要注意用用sum[i+1]代表前i个数的和，并且sum[0]=0，因为可能有数列整体和为0的情况
     */
    public static void main(String[] args){

        int array[] = {3,0,-1,-2,-3,1,1,1,2,3,1,-2,-1};
        display maxGap[] = new display[2];
        maxGap[0] = new display(0,0);
        findSum0Seq(array, maxGap);

        for(int i=maxGap[0].start; i<maxGap[0].end; i++){
            System.out.print(array[i] + " ");
        }
    }

    static int findSum0Seq(int num[], display[] maxGap){
        int length = num.length;
        int sum[] = new int[length + 1];

        HashMap<Integer, display> numMap = new HashMap<>();
        numMap.put(0, new display(0, 0));
        int start = 0, end = 0, diff = 0, max = 0;
        for(int i=0; i<length; i++){
            sum[i+1] = sum[i] + num[i];
            if(numMap.containsKey(sum[i+1])){
                start = numMap.get(sum[i+1]).start;
                end = i+1;
                diff = end - start;
                numMap.put(sum[i+1], new display(start, end));
                if(diff > max){
                    max = diff;
                    maxGap[0].start = start;
                    maxGap[0].end = end;
                }
            }
        }
        return max;
    }

    static class display{
        int start;
        int end;
        public display(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
