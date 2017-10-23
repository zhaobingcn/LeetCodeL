package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/9/12.
 */

/**
 * 最长递增子序列
 */

public class Number_of_Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        int nums[] = {2,2,2,2,2,2,2,2,2,2,2,2,22,3,3,3,3,3,324,3,234,2,4,2,34,234,2,4,3,4,24,2,3,4,34,45,4,545,4,34,345534,345,34,34};

        System.out.println(findNumberOfLIS(nums));

    }

    public static int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len+1];
        int dp_count[] = new int[len+1];
        for(int i=0; i<len; i++){
            dp_count[i] = 1;
        }
        int max;
        int all_max = 1;
        int max_count = 0;
        for(int i=0; i<len; i++){
            max = 0;
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    if(dp[j] > max){
                        max = dp[j];
                        dp_count[i] = dp_count[j];
                    }else if(dp[j] == max){
                        dp_count[i] = dp_count[i] + dp_count[j];
                    }
                }
            }
            dp[i] = max + 1;

            if(dp[i] > all_max){
                all_max = dp[i];
            }

        }

        for(int i=0; i<len; i++){
            if(dp[i] == all_max){
                max_count += dp_count[i];
            }
        }
        return max_count;
    }
}
