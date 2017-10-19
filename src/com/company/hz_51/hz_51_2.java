package com.company.hz_51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhzy on 2017/10/18.
 */
public class hz_51_2 {


        public static void main(String[] args) throws IOException {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String[] strArray = buffer.readLine().split(" ");
            System.out.println(strArray[0] + "    " + strArray[1]);
            System.out.println(bigNumberMultiply(strArray[0], strArray[1]));
        }


    private static String bigNumberMultiply(String first, String second) {

        boolean flag = false;

        if (first.charAt(0) == '-') {
            flag = !flag;
            first = first.substring(1);
        }

        if (second.charAt(0) == '-') {
            flag = !flag;
            second = second.substring(1);
        }
        int aPoints = 0;
        int bPoints = 0;
        if(first.contains(".")){
            aPoints= first.length() - first.indexOf('.') - 1;
        }
        if(second.contains(".")){
            bPoints= second.length() - second.indexOf('.') - 1;
        }

        int pointPos = aPoints + bPoints; // 结果的小数点位置


        StringBuffer aBuffer = new StringBuffer(first.replaceAll("\\.", ""));
        StringBuffer bBuffer = new StringBuffer(second.replaceAll("\\.", ""));

        int[] a = string2IntArray(aBuffer.toString());
        int[] b = string2IntArray(bBuffer.toString());

        int[] result = new int[a.length + b.length - 1];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                result[i + j] += a[i] * b[j];
            }
        }


        for (int i = result.length - 1; i > 0; --i) {
            if (result[i] > 9) {
                result[i - 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < result.length; ++i) {

            if(result.length - i == pointPos) {
                buffer.append(".");
            }
            buffer.append(String.valueOf(result[i]));
        }

        if (buffer.indexOf(".") != -1)
        {

            int i = 0;
            while (i < buffer.length()) {
                if (buffer.length() > 2 && buffer.charAt(i+1) == '.') {
                    break;
                } else if (buffer.charAt(i) == '0') {
                    buffer.deleteCharAt(i);
                    i = 0;
                    continue;
                } else {
                    break;
                }
            }


            i = buffer.length() - 1;
            while (i >= 0) {
                if (buffer.length() > 2 && buffer.charAt(i-1) == '.') {
                    break;
                } else if (buffer.charAt(i) == '0') {
                    buffer.deleteCharAt(i);
                    i = buffer.length() - 1;
                    continue;
                } else {
                    break;
                }
            }
        }


        if (flag) {
            return "-" + buffer.toString();
        } else {
            return buffer.toString();
        }
    }


    private static int[] string2IntArray(String number) {
        Pattern pattern = Pattern.compile("^(-?\\d+|\\d*)\\.?\\d*$");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.find()) {
            throw new IllegalArgumentException("输入的数不正确!");
        }

        int[] result = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[i] = (int) (number.charAt(i) - '0');
        }
        return result;
    }
}
