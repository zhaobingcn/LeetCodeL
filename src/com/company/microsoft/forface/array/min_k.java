package com.company.microsoft.forface.array;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/4/27.
 */
public class min_k {

    public static void main(String[] args){
        int []array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        ArrayList<Integer> result = GetLeastNumbers_Solution(array, 19);
        System.out.println(result);
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input == null)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(k > input.length)
            return list;
        int low = 0;
        int high = input.length - 1;
        int index = partition(input,low,high);
        while(index != k-1){
            if(index > k-1){
                high = index - 1;
            }else{
                low = index + 1;
            }
            index = partition(input,low,high);
        }
        for(int i = 0; i < k; i++){
            list.add(input[i]);
        }
        return list;
    }
    //划分操作
    public static int partition(int[] array,int start,int end){
        int pivot = array[start];
        while(start < end){
            while(start < end && array[end] >= pivot) end--;
            array[start] = array[end];
            while(start < end && array[start] <= pivot) start++;
            array[end] = array[start];
        }
        array[start] = pivot;
        return start;
    }

}
