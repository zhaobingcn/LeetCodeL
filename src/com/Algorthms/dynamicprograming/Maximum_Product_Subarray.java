package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/10/1.
 */
public class Maximum_Product_Subarray {


    public static void main(String[] args) {

        int[] nums = new int[]{3,-1,4};
        System.out.println(maxProduct(nums));

    }
    public static int maxProduct(int[] nums) {
        int r = nums[0];

        return 0;
    }

    /**
     * 错误的解法
     */

//    public int maxProduct(int[] nums) {
//
//        int len = nums.length;
//        int dp[][] = new int[2][len + 1];
//
//        // for(int i=0; i<2; i++){
//        //     for(int j=0; j<=len; j++){
//        //         dp[i][j] = 1;
//        //     }
//        // }
//        dp[0][1] = nums[0];
//        dp[1][1] = nums[0];
//
//        int max = Integer.MIN_VALUE;
//        int tag = -10;
//
//        for(int i=2; i<len; i++){
//            if(nums[i] > 0){
//                dp[0][i+1] = dp[0][i] * nums[i];
//                if(dp[1][i] < 0){
//                    dp[1][i+1] = dp[1][i] * nums[i];
//                }
//                if(dp[0][i+1] > max){
//                    max = dp[0][i+1];
//                    if(max == 1){
//                        tag = i;
//                    }
//                }
//            }else if(nums[i] == 0){
//                dp[0][i+1] = 1;
//                dp[1][i+1] = 1;
//                if(0 > max){
//                    max = 0;
//                }
//            }else{
//                if(dp[1][i] < 0){
//                    dp[0][i+1] = dp[1][i] * nums[i];
//                }
//                dp[1][i+1] = dp[0][i] * nums[i];
//                if(dp[0][i+1] > max){
//                    max = dp[0][i+1];
//                    if(max == 1){
//                        tag = i;
//                    }
//                }
//            }
//        }
//        if(max == 1 && nums[0] != -1){
//            max = nums[tag];
//        }
//        return max;
//    }
}
