package com.company.SwordOffer;

import java.util.Arrays;

/**
 * Created by zhzy on 2017/5/13.
 */
public class problem54 {

    public static void main(String[] args){

        char[] str = new String("").toCharArray();
        char[] pattern = new String(".*").toCharArray();
        System.out.println(match(str, pattern));
    }

    public static boolean match(char[] str, char[] pattern)
    {
        if(str.length <1 && pattern.length<1){
            return true;
        }
        return matchCore(str, pattern);
    }

    public static boolean matchCore(char[] str, char[] pattern){

        if(str.length ==0 && pattern.length ==0){
            return true;
        }
        if(str.length >0 && pattern.length ==0){
            return false;
        }
        if(pattern.length > 1 && str.length > 0){
            if(pattern[1] == '*'){
                if(pattern[0] == str[0] || (pattern[0] == '.' && str.length>0))
                    return matchCore(Arrays.copyOfRange(str, 1,str.length), Arrays.copyOfRange(pattern, 2, pattern.length))
                            || matchCore(Arrays.copyOfRange(str, 1,str.length), pattern)
                            || matchCore(str,  Arrays.copyOfRange(pattern, 2, pattern.length));
                else
                    return matchCore(str, Arrays.copyOfRange(pattern, 2, pattern.length));
            }
        }

        if(str.length>0){
            if((pattern[0] == '.' && str.length>0) || pattern[0] == str[0])
                return matchCore(Arrays.copyOfRange(str, 1,str.length), Arrays.copyOfRange(pattern, 1, pattern.length));
        }
//        if(str.length==0 && pattern.length >0){
//            if(pattern[0] == '.'){
//                return ;
//            }
//        }
        return false;

    }
}
