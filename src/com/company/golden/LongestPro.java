package com.company.golden;

import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/24.
 */
public class LongestPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            String s = scanner.next();
            System.out.println(longestPalindrome(s));
        }
    }


    public static int longestPalindrome(String s) {

        //马拉车算法
        int MaxRight = 0;
        int pos = 0;
        int max = 0;
        int len = s.length();
        StringBuffer newString = new StringBuffer("#");
        for(int i=0; i<len; i++){
            newString.append(s.charAt(i));
            newString.append("#");
        }
        int newLen = newString.length();

        String longestPalindrome = "";
        int RL[] = new int[s.length()*2 +1];

        for(int i=0; i<newLen; i++){
            if(i < MaxRight){
                RL[i] = Math.min(RL[2*pos - i], MaxRight-i);
            }else {
                RL[i] = 1;
            }

            while (i-RL[i] >=0 && i+RL[i] <newLen && newString.charAt(i-RL[i]) == newString.charAt(i+RL[i])){
                RL[i] ++;
            }

            if(i+RL[i]-1 > MaxRight){
                MaxRight = i+RL[i]-1;
                pos = i;
            }
            if(RL[i] > max){
                max = RL[i];
//                longestPalindrome = newString.substring(i-RL[i]+1, i+RL[i]);
            }

        }
//        return longestPalindrome.replaceAll("#", "");
        return max-1;
    }


    //n^2的方法
//        int len = s.length();
//        int max = 0;
//        String longestPalindrome = "";
//        for(int i=0; i<len; i++){
//
//            int length = 1;
//            if(length > max){
//                max = length;
//                longestPalindrome = s.substring(i, i+1);
//            }
//            for(int j=1; i-j>=0 && i+j <len; j++){
//                if(s.charAt(i-j) == s.charAt(i+j)){
//                    length = length +2;
//                    if(length > max){
//                        max = length;
//                        longestPalindrome = s.substring(i-j, i+j+1);
//                    }
//                }else {
//                    break;
//                }
//            }
//
//
//            int k = i+1;
//            if(k < len && s.charAt(i) == s.charAt(k)){
//                length = 2;
//                if(length > max){
//                    max = length;
//                    longestPalindrome = s.substring(i, k+1);
//                }
//                for(int j=1; i-j>=0 && k+j<len; j++){
//                    if(s.charAt(i-j) == s.charAt(k+j)){
//                        length = length +2;
//                        if(length > max){
//                            max = length;
//                            longestPalindrome = s.substring(i-j, k+j+1);
//                        }
//                    }else {
//                        break;
//                    }
//                }
//            }
//        }
//        return longestPalindrome;


}
