package com.company.mobai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] num = new int[n];

        HashMap<Integer, Integer> nummap = new HashMap<>();
        int i;
        for (i = 0; i < n; i++) {
            num[i] = in.nextInt();
            nummap.put(num[i], i);
        }
        Arrays.sort(num);
        int count = 0;
        for (int j = 0; j < n - 1; j++) {
            if (nummap.get(num[j + 1]) < nummap.get(num[j])) {
                nummap.put(num[j + 1], i++);
                count++;
            }
        }
        System.out.println(count);


    }
}