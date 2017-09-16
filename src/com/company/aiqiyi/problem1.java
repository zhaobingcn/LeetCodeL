package com.company.aiqiyi;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/9/10.
 */
public class problem1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int v1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int k2 = scanner.nextInt();

        String s1 = repeat(v1,k1);
        String s2 = repeat(v2,k2);

        if(s1.length() > s2.length()){
            System.out.println("Greater");
        }else if(s1.length() < s2.length()){
            System.out.println("Less");
        }else {
            int result = s1.compareTo(s2);
            if(result > 0){
                System.out.println("Greater");
            }else if(result == 0){
                System.out.println("Equal");
            }else {
                System.out.println("Less");
            }
        }

    }

    static String repeat(int v, int k){
        String strV = String.valueOf(v);
        StringBuffer s = new StringBuffer();
        for(int i=0; i<k; i++){
            s.append(strV);
        }
        return s.toString();
    }
}
