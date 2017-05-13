package com.company.SwordOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhzy on 2017/5/12.
 */
public class problem40 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 0){
            return;
        }
        int number = 0;
        for(int i:array){
            number ^= i;
        }
        int indexBit = 0;
        while ((number&1) == 0 && (indexBit < 8*32)){
            number = number>>1;
            ++indexBit;
        }
        int num_1 = 0;
        int num_2 = 0;
        for(int i=0; i<array.length; i++){
            if(isBit1(array[i], indexBit)){
                num_1 ^= array[i];
            }else{
                num_2 ^= array[i];
            }
        }
        num1[0] = num_1;
        num2[0] = num_2;

    }
    public boolean isBit1(int num, int indexBit){
        num = num>>indexBit;
        return (num&1) == 1;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int a = 1223;
        int b = 323;
        System.out.println(a^b^0);
    }
}
