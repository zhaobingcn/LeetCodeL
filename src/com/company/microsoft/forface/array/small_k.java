package com.company.microsoft.forface.array;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/4/13.
 */
public class small_k {

    public static void main(String[] args){

        int []array = {4,6,8,7,1,3,5,2};
        ArrayList<Integer> result = GetLeastNumbers_Solution(array, 7);
        System.out.println(result);
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int low = 0;
        int high = input.length-1;
        ArrayList<Integer> output = new ArrayList<Integer>();
        int index = Partation(input, low, high);
        while(index != k-1){
            if(index > k-1){
                high = index-1;
                index = Partation(input, low, high);
            }else{
                low = index+1;
                index = Partation(input, low, high);
            }
        }

        for(int i=0; i<k; i++){
            output.add(input[i]);
        }
        return output;
    }

    public static int Partation(int[] array, int low, int high){
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
