package com.company.microsoft.forface.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by zhzy on 2017/4/13.
 */
public class Quick_Sort {

    public static void main(String[] args){

        int array[] = {3,4,5,24,24,5422,45,324,324,354,2};

        quick_sort(array, 0, array.length -1);

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length; i++){
            if(number.containsKey(array[i])){
                number.put(array[i], number.get(array) + 1);
            }else{
                number.put(array[i], 1);
            }
        }


    }
    static void quick_sort(int[] array, int from , int to){

        if(from < to) {
            int index = Partation(array, from, to);
            quick_sort(array, from, index-1);
            quick_sort(array, index+1, to);
        }

    }

    static int Partation(int[] array, int low, int high){
        int temp = array[low];
        while(low < high){
            while(low < high && array[high] >=temp){
                high --;
            }
            array[low] = array[high];

            while(low < high && array[low] <=temp){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }
}
