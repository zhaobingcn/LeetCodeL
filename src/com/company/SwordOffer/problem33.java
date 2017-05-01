package com.company.SwordOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhzy on 2017/4/30.
 */
public class problem33 {


    public static void main(String[] args){


        int[] a = {1,2,3,4};

        System.out.println(PrintMinNumber(a));
    }
    static String PrintMinNumber(int [] numbers) {

        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new compare());
        String result = "";
        for(int i=0; i<numbers.length; i++){
            result += str[i];
        }
        return result;
    }



    static class compare implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            String str1 = String.valueOf(o1) + String.valueOf(o2);
            String str2 = String.valueOf(o2) + String.valueOf(o1);
            return str1.compareTo(str2);
        }
    }
}
