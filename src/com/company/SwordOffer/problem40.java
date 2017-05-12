package com.company.SwordOffer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhzy on 2017/5/12.
 */
public class problem40 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<array.length; i++){
            if(set.contains(array[i])){
                set.remove(array[i]);
            }else{
                set.add(array[i]);
            }
        }
        Iterator<Integer> iter = set.iterator();
        num1[0] = iter.next();
        num2[0] = iter.next();
    }
    public static void main(String[] args){

    }
}
