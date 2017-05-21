package com.company.niuke;

/**
 * Created by zhzy on 2017/5/19.
 */
import java.util.Arrays;
import java.util.Scanner;
    public class problem2{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {
                int a = in.nextInt();
                int[] b = new int[a*3];
                for(int i=0; i<a*3; i++){
                    b[i] = in.nextInt();
                }
                Arrays.sort(b);
                long sum = 0;
                for(int i =a; i<a*3; i=i+2){
                    sum+=b[i];
                }
                System.out.println(sum);
            }
        }
    }

