package com.company.golden;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhzy on 2017/8/22.
 */
public class Permutation {

    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        permutation(list, A.toCharArray(), 0);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public void permutation(ArrayList<String> list, char[] array, int k){

        if(k == array.length){
            list.add(new String(array));
            return;
        }

        for(int i=k; i<array.length; i++){
            Swap(array, i, k);
            permutation(list, array, k+1);
            Swap(array, i, k);
        }
    }


    public void Swap(char[] array, int i, int k){
        if(i != k){
            char temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }
}
