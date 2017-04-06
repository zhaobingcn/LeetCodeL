package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int len = word.length();
        String[] words = new String[len];
        for(int i=0; i<len; i++){
            words[i] = word.substring(i);
        }

        Arrays.sort(words);

        for(int i=0; i<len; i++){
            System.out.println(words[i]);
        }
    }
}
