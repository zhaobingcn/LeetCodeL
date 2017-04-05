package com.company.microsoft;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/2.
 */
public class problem1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int P = input.nextInt();
            int Q = input.nextInt();
            int N = input.nextInt();
            double result = 0.0;
            double double_q = 1.0*Q / 100;
            for(int i=0; i<N; i++){
                double nextLegendary = getNextLegendary(P, double_q);
                result += nextLegendary;
                P /= 2;
            }
            System.out.printf("%.2f", result);

        }


    static double getNextLegendary(int P, double q){
//        非常简洁的解法
//        double needQuest = 1.0;
//        double needAnotherQuest = 1.0;
//        double double_p = P*1.0 / 100;
//        while(true){
//            needAnotherQuest *= (1-double_p);
//            needQuest += needAnotherQuest;
//            double_p += q;
//            if(double_p >= 1.0){
//                break;
//            }
//        }

        //自己想到的解法
        long questTimes = 2;
        double double_p = P*1.0 / 100;
        double needQuest = 1.0*double_p;

        double anotherQuestPoss = 1.0-double_p;
        double sucessPoss = double_p + q;
        while(true){
            if(sucessPoss >= 1.0){
                needQuest = needQuest + questTimes*anotherQuestPoss*1.0;
                break;
            }
            needQuest += questTimes*anotherQuestPoss*sucessPoss;
            anotherQuestPoss -= q;
            sucessPoss += q;
            questTimes++;
        }

        return needQuest;
    }
}

