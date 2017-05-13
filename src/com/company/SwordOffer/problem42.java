package com.company.SwordOffer;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem42 {

    public static void main(String[] args){
        int[] array = {1,2,4,7,11,15};
        System.out.println(FindNumbersWithSum(array, 15));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int small = 0;
        int big = array.length - 1;

        ArrayList<Integer> temp = new ArrayList<Integer>(2);

        int currentSum = array[small] + array[big];
        int a=0;
        int b=0;
        int max = 0;
        while(small <= big){

            if(currentSum == sum){
                if(array[small]*array[big] > max){
                    a = array[small];
                    b = array[big];
                    max = a*b;
                }
                small ++;
                currentSum = array[small] + array[big];
            }

            if(currentSum < sum){
                small ++;
                currentSum = array[small] + array[big];
            }else{
                big --;
                currentSum = array[small] + array[big];
            }
        }
        if(a==0 && b==0){
            return temp;
        }
        temp.add(a);
        temp.add(b);
        return temp;
    }
}
