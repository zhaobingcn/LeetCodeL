package com.company.microsoft.forface.array;

import java.util.Random;

/**
 * Created by zhzy on 2017/4/13.
 */
public class Quick_Sort {

    public static void main(String[] args){

        int array[] = { 4,5,1,6,2,7,3,8 };

        Partation(array, 0, array.length-1);

        for(int i=0; i<array.length-1; i++){
            System.out.println(array[i]);
        }
    }

    static int Partation(int[] array, int low, int high){
        int temp = array[0];
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
