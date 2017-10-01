package com.Algorthms.dynamicprograming;

import java.util.Stack;

/**
 * Created by zhzy on 2017/9/26.
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int maxNum = Integer.MIN_VALUE;
        int maxPrices = Integer.MIN_VALUE;
        for(int i=prices.length-1; i>=0; i--){
            if(prices[i] > maxNum){
                maxNum = prices[i];
            }
            int price = maxNum - prices[i];
            if(price > maxPrices){
                maxPrices = price;
            }
        }
        return maxPrices;
    }
}
