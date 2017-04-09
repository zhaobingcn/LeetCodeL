package com.company.renren;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/4/9.
 */
public class problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int seq[] = new int[num];
            for (int i = 0; i < num; i++) {
                seq[i] = scanner.nextInt();
            }
            long leftSum = seq[0];
            long rightSum = 0;
            for (int i = 1; i < num; i++) {
                rightSum += seq[i];
            }
            int count = 0;
            for (int i = 0; i < num - 1; i++) {
                if (leftSum == rightSum) {
                    count++;
                }
                leftSum += seq[i + 1];
                rightSum -= seq[i + 1];
            }

            System.out.println(count);
        }
    }
}
