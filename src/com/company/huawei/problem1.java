package com.company.huawei;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/16.
 */
public class problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(passSimple(input));
    }
    public static String passSimple(String s){

        String result;
        char[] charArray = s.toCharArray();

        int index1 = 0;
        int index2 = 0;
        // look for '@'
        for( int i=0; i<s.length(); i++ ){
            if( charArray[i] == '@' ){
                index1 = i;
            }
        }
        // look for the last '.' after '@'
        for( int i=index1; i<s.length(); i++ ){
            if( charArray[i] == '.' ){
                index2 = i;
            }
        }

        if( index1 <3 ){
            return s.substring(0,index2);
        }
        else{
            charArray[index1-1] = '*';
            charArray[index1-2] = '*';
            charArray[index1-3] = '*';
            result = new String(charArray);
            return result.substring(0,index2);
        }
    }
}
