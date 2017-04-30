package com.company.microsoft.forface.array;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by zhzy on 2017/4/27.
 */
public class allSeq {


    public static void main(String[] args){

        char[] chr = {'a', 'a', 'c'};

        Permutation(chr, 0);
    }

    static void Permutation(char []chr, int begin) {

        if (begin == chr.length - 1) {

            System.out.println(String.valueOf(chr));

        } else {

        for (int i = begin; i < chr.length; i++) {

            if(chr[i] != chr[begin]){
                char temp = chr[i];
                chr[i] = chr[begin];
                chr[begin] = temp;
            }


            Permutation(chr, begin + 1);

            if(chr[i] != chr[begin]){
                char temp = chr[i];
                chr[i] = chr[begin];
                chr[begin] = temp;
            }

        }
    }

    }
}