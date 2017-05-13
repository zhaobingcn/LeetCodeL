package com.company.SwordOffer;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem42_2 {

    public static void main(String[] args){

        String a = "I am a student";

        System.out.println( ReverseSentence(a));
    }

    public static String ReverseSentence(String str) {

        char[] chrArray = str.toCharArray();
        reverse(chrArray, 0, chrArray.length-1);

        int pBegin = 0;
        int pEnd = 0;
        for(int i=0; i<chrArray.length; i++){
            if(chrArray[i]!=' '){
                pEnd++;
            }else{
                reverse(chrArray, pBegin, pEnd-1);
                pBegin = pEnd + 1;
                pEnd = pEnd + 1;
            }
        }
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
