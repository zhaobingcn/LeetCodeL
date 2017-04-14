package com.company.microsoft.forface.String;

import java.util.ArrayList;

/**
 * Created by zhzy on 2017/4/13.
 */
public class char_string {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrStr = new ArrayList<String>();
        if(str == null){
            return arrStr;
        }
        char chs[] = str.toCharArray();
        arrStr.add(String.valueOf(chs));
        int point = 0;
        char temp = chs[point];
        chs[point] = chs[++point];
        chs[point] = temp;

        while(!String.valueOf(chs).equals(str)){
            arrStr.add(String.valueOf(chs));
            if(point == str.length() -1) {
                char temp1 = chs[0];
                chs[0] = chs[point];
                chs[point] = temp1;
                point = 0;

            }
            else{
                char temp1 = chs[point];
                chs[point] = chs[++point];
                chs[point] = temp1;
            }
        }
        return arrStr;
    }
}
