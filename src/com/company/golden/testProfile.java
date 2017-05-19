package com.company.golden;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by zhzy on 2017/5/18.
 */
public class testProfile {

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>(1<<23);
        for(int i=0; i<(1<<23); i++){
            a.add(i);
        }

        a.stream().parallel().forEach(b -> System.out.println(b));

    }
}
