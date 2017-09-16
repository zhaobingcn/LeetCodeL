package com.test;

/**
 * Created by zhzy on 2017/9/11.
 */

/**
 * 硬币问题，递归和dp的写法
 */

public class test1 {

    public static void main(String[] args) {
        int coins[] = {1,8,20};

        System.out.println(dpChange(coins, 984));
    }
//    static int recursiveCoins(int coins[], int money){
//
//        if(money == 0){
//            return 0;
//        }
//        int minChangeCount = Integer.MAX_VALUE;
//
//        for(int i=0; i<coins.length; i++){
//            if(money - coins[i] >= 0){
//                int count = recursiveCoins(coins, money - coins[i]);
//                if(count + 1< minChangeCount){
//                    minChangeCount = count + 1;
//                }
//            }
//        }
//        return minChangeCount;
//    }

    static int dpChange(int coins[], int money){

        int dp[] = new int[money + 1];



        for(int i=1; i<=money; i++){
            int minChange = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){

                if(i >=coins[j] ){
                    int count = dp[i - coins[j]];
                    if(count + 1 < minChange){
                        minChange = count + 1;
                    }
                }
                dp[i] = minChange;
            }
        }
        return dp[money];
    }

}
