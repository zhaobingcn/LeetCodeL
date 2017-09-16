package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/9/16.
 */

/**
 * 要注意这里假如两位数以0开始，那么是翻译不成任何序列的，也就代表着当前序列失败
 *
 */
public class Decode_Ways {

    public static void main(String[] args) {

        System.out.println(numDecodings("12"));
    }

    public static int numDecodings(String s) {

        int len = s.length();
        if(s == null || len == 0){
            return 0;
        }else if(len == 1){
            if(s.charAt(0) == '0'){
                return 0;
            }else{
                return 1;
            }
        }
        int dp[] = new int[len + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0'? 0 : 1;

        for(int i=2; i<=len; i++){

            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));

            if(first >=1 && first <=9){
                dp[i] = dp[i] + dp[i-1];
            }
            if(second >=10 && second <=26){
                dp[i] = dp[i] + dp[i-2];
            }

        }

        return dp[len];
    }

}
