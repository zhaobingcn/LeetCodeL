package com.company.niuke;

import java.util.*;

/**
 * Created by zhzy on 2017/5/19.
 */
public class problem3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] b = new int[n][3];
        List<value> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            b[i][0] = scanner.nextInt();
            b[i][1] = scanner.nextInt();
            b[i][2] = b[i][1]-b[i][0];
            result.add(new value(b[i][0], b[i][1], b[i][2]));
        }

        Collections.sort(result, new Comparator<value>() {
            @Override
            public int compare(value o1, value o2) {
                return o1.a - o2.a;
            }
        });

        int sum[] = new int[n];
        int max = 0;
        int i=0;
        for(value avalue:result){
            b[i][0] = avalue.a;
            b[i][1] = avalue.b;
            b[i][2] = avalue.c;
            i++;
        }

        for(int j=0; j<n-1; j++){
            sum[j] =3;
        }

    }

    static class value {
        int a;
        int b;
        int c;
        public value(int a, int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
}

/**


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] b = new int[n][3];
        for(int i=0; i<n; i++){
            b[i][0] = scanner.nextInt();
            b[i][1] = scanner.nextInt();
            b[i][2] = b[i][1]-b[i][0];
        }

        int max = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = 0;
            for(int j=0; j<n; j++){
                if(b[i][0] > b[j][0] && b[j][2] > 0) {
                    sum += b[j][2];
                }
            }
            sum = sum+b[i][1]+b[i][0];
            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);
    }
}
 **/