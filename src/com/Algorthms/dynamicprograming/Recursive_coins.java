package com.Algorthms.dynamicprograming;

/**
 * Created by zhzy on 2017/8/23.
 */
public class Recursive_coins {

    public static void main(String[] args) {
        int coins[] = {3,6,10};

        System.out.println(recursive(27, coins));
//        System.out.println(DPchage(27, coins));
    }

    static int recursive(int money, int coins[]){
        if(money == 0){
            return 0;
        }
        int MinNumCoins = Integer.MAX_VALUE;
        int NumCoins =0;
        for(int i=0; i<coins.length; i++){
            if(money >= coins[i]){
                NumCoins = recursive(money - coins[i], coins);
                if(NumCoins + 1 < MinNumCoins){
                    MinNumCoins = NumCoins + 1;
                }
            }
        }

        return MinNumCoins;
    }

//    static int DPchage(int money, int coins[]){
//        int MinNumCoins[] = new int[money+1];
//        for(int i=1; i<=money; i++){
//            MinNumCoins[i] = Integer.MAX_VALUE;
//            int NumCoins;
//            for(int j=0; j<coins.length; j++){
//                if(i >= coins[j]){
//                    NumCoins = MinNumCoins[i-coins[j]] + 1;
//                    if(NumCoins < MinNumCoins[i]){
//                        MinNumCoins[i] = NumCoins;
//                    }
//                }
//            }
//        }
//        return MinNumCoins[money];
//    }
}
