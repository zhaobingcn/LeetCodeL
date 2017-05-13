package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem42_1 {

    public static void main(String[] args){

        String a = "abcXYZdef";
        System.out.println(LeftRotateString(a, 3));
    }
        public static String LeftRotateString(String str,int n) {
            if(str.length() <= 3){
                return str;
            }
            int len = str.length();
            char[] chrArray = str.toCharArray();
            reverse(chrArray, 0, n-1);
            reverse(chrArray, n, len-1);
            reverse(chrArray, 0, len-1);
            return String.valueOf(chrArray);
        }

        public static void reverse(char[] array, int begin, int end){

            while(begin < end){
                char temp = array[end];
                array[end] = array[begin];
                array[begin] = temp;
                end--;
                begin++;
            }
        }

}
