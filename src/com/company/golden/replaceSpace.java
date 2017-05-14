package com.company.golden;

/**
 * Created by zhzy on 2017/5/14.
 */
public class replaceSpace {

    public static void main(String[] args){
        String a = "hello world";
        System.out.println(replaceSpace(a, 11));
    }

    public static String replaceSpace(String iniString, int length) {
        // write code here
        char[] charArray = iniString.toCharArray();
        int numOfBlank = 0;

        for(int i=0; i<length; i++){
            if(charArray[i] == ' '){
                numOfBlank ++;
            }
        }
        int newLength = length + numOfBlank*2;
        char[] result = new char[newLength];
        int p = newLength-1;
        for(int i=length-1; i>=0; i--){
            if(charArray[i] != ' '){
                result[p--] = charArray[i];
            }
            else{
                result[p--] = '0';
                result[p--] = '2';
                result[p--] = '%';
            }
        }
        return String.valueOf(result);
    }
}
