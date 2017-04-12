package com.company.microsoft.forface.String;

/**
 * Created by zhzy on 17-4-12.
 */
public class blank_replace_4 {

    public static void main(String[] args){
        StringBuffer a = new StringBuffer("hello world");
        replaceSpace(a);
    }

    public static String replaceSpace(StringBuffer str) {
        String b = "asdad";
        int originalLength = str.length();
        int numberOfBlank = 0;
        for(int i=0; i<originalLength; i++){
            if(str.charAt(i) == ' '){
                numberOfBlank++;
            }
        }

        int newLength = originalLength + numberOfBlank*2;
        char[] newString = new char[newLength+1];

        int p2 = newLength-1;
        int p1 = originalLength-1;

        while(p1>=0 && p2>p1){
            if(str.charAt(p1) == ' '){
                newString[p2--] = '0';
                newString[p2--] = '2';
                newString[p2--] = '%';
            }else{
                newString[p2--] = str.charAt(p1);
            }
            p1--;
        }
        for(int i=0; i<newLength; i++){
            System.out.print(newString[i]);
        }
        return newString.toString();
    }
}
