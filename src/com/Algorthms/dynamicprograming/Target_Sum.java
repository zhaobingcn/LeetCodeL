package com.Algorthms.dynamicprograming;

import java.util.Arrays;

/**
 * Created by zhzy on 2017/9/17.
 */
public class Target_Sum {


    /**
     * 递归解法
     */
//    int count = 0;
//
//    public static void main(String[] args) {
//
//    }
//
//    public int findTargetSumWays(int[] nums, int S) {
//
//        calaulate(nums, 0, S, 0);
//        return count;
//    }
//
//    void calaulate(int nums[], int i, int S, int sum){
//
//        if(sum == S && i==nums.length){
//            count++;
//        }
//
//        calaulate(nums, i+1, S, sum + nums[i]);
//        calaulate(nums, i+1, S, sum - nums[i]);
//    }

    /**
     * 方法二
     * 非递归解法
     * dp解法
     */
//    public int findTargetSumWays(int[] nums, int S) {
//
//        int sum = 0;
//        for(int i=0; i<nums.length; i++){
//            sum += nums[i];
//        }
//
//        if(S > Math.abs(sum)){
//            return 0;
//        }
//
//        int dp[] = new int[sum * 2 + 1];
//        dp[0 + sum] = 1;
//
//        for(int i=0; i<nums.length; i++){
//
//            int next[] = new int[2*sum + 1];
//
//            for(int j=0; j<2*sum + 1; j++){
//                if(dp[j] != 0){
//                    next[j + nums[i]] += dp[j];
//                    next[j - nums[i]] += dp[j];
//                }
//            }
//            dp = next;
//        }
//        return dp[sum + S];
//    }

    /**
     * 我自己的方法，方法三
     * @param nums
     * @param S
     * @return
     */
    public static int findTargetSumWays(int[] nums, int S) {

        int num = 1 << (nums.length);

        int dp[] = new int[num];

        for(int i=0; i<nums.length; i++){
            int next[] = new int[num];
            for(int j=0; j<(1<< i); j++){
                next[2*j] = dp[j] + nums[i];
                next[2*j + 1] = dp[j] - nums[i];
            }
            dp = next;
        }
        int count = 0;
        for(int i=0; i<num; i++){
            if(dp[i] == S){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,1,1,1,1};
        System.out.println(findTargetSumWays(a, 3));
    }






}
