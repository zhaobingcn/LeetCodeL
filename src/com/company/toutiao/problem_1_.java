package com.company.toutiao;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/10/17.
 */
public class problem_1_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int room[] = new int[n];

        for(int i=0; i<n; i++){
            room[i] = scanner.nextInt();
        }

        scanner.close();
        int i = x - 1;
        int count = 0;

        for(int j=i; j>=0; j--){
            room[j] = room[j] -1;
        }

        int min = Integer.MAX_VALUE;

        for(int j=0; j<n; j++){
            if(room[j] < min){
                min = room[j];
            }
        }

        for(int j=0; j<n; j++){
            room[j] = room[j] - min;
        }
        count = min * n;


        for(int j=i; j>=0; j--){
            room[j] = room[j] +1;
        }

        for(; i>=0 ;){
            if(room[i] == 0){
                room[i] = count;
                break;
            }else {
                count ++;
                room[i] = room[i] - 1;
                i--;
                if(i == -1){
                    i = n-1;
                }
            }
        }

        for(int j=0; j<n; j++){
            System.out.print(room[j] + " ");
        }

    }


}
