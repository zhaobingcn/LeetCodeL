package com.company.mobai;


import java.util.Scanner;

/**
 * Created by zhzy on 2017/10/19.
 */
public class problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int lena = a.length();
        int lenb = b.length();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i=0; i<=lenb-lena; i++){
            count = countMin(a, b.substring(i, i+lena));
            if(count < min){
                min = count;
            }
        }
        System.out.println(min);

    }

    static int countMin(String a, String b){
        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                count ++;
            }
        }
        return count;
    }



}
