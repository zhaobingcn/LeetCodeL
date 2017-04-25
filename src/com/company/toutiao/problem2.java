package com.company.toutiao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/18.
 */
public class problem2 {

    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        HashSet<String> set = new HashSet<String>();
//
//        while(scanner.hasNext()){
//            String temp = scanner.next();
//            if(temp.equals("0")){
//                break;
//            }
//            set.add(temp);
//        }
//        int size = set.size();
//        System.out.println(size);
        Scanner scanner = new Scanner(System.in);
        HashSet<Long> set = new HashSet<Long>();

        while(scanner.hasNext()){
            Long temp = scanner.nextLong();
            if(temp == 0){
                break;
            }
            set.add(temp);
        }
        System.out.println(set.size());
    }
}


