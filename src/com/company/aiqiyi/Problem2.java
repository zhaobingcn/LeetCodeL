package com.company.aiqiyi;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/9/10.
 */

public class Problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int countR = 0;
        int count = 0;
        int countG = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'R'){
                countR ++;
            }
            if(s.charAt(i) == 'G'){
                countG ++;
            }
        }

        int i=0;
        for(; i<countR; i++){
            if(s.charAt(i) == 'G'){
                count ++;
            }
        }

        for(;i <s.length(); i++){
            if(s.charAt(i) == 'R'){
                count ++;
            }
        }
        if(countG < count){
            if(countR < count){
                if(countG < countR){
                    min = countG;
                }else {
                    min = countR;
                }
            }else {
                min = countG;
            }
        }

        else if(countR <count){
            if(countG < count){
                if(countR <countG){
                    min = countR;
                }else {
                    min = countG;
                }
            }else {
                min = countR;
            }
        }else {
            min = count;
        }

        System.out.println(min);

    }


}
