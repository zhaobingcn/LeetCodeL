package com.niuKeSecondTime;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/10/18.
 */
public class 求和为S的两个数字 {

    /**
     * 和为s的两个数字安排两个指针，一个small一个big，如果currentSum < sum就small++如果currentSum > sum就big--
     *
     * 注意surrentSum == sum的时候也要small++   不然会造成死循环
     * @param array
     * @param sum
     * @return
     */

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        int small = 0;
        int big = array.length - 1;
        ArrayList<Integer> res = new ArrayList<>();
        if(array.length == 0){
            return res;
        }

        int currentSum = array[small] + array[big];
        int minValue = Integer.MAX_VALUE;
        int currentValue = 0;

        int resa = 0;
        int resb = 0;
        while(small < big){

            if(sum == currentSum){
                currentValue = array[small] * array[big];

                if(currentValue < minValue){
                    minValue = currentValue;
                    resa = array[small];
                    resb = array[big];
                }
                small ++;
                currentSum = array[small] + array[big];
            }
            if(currentSum < sum){
                small ++;
                currentSum = array[small] + array[big];

            }
            if(currentSum > sum){
                big --;
                currentSum = array[small] + array[big];
            }
        }
        if(resa==0 && resb==0){
            return res;
        }
        res.add(resa);
        res.add(resb);
        return res;
    }
}
