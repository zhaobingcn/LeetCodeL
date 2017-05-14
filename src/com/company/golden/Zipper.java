package com.company.golden;

/**
 * Created by zhzy on 2017/5/14.
 */
public class Zipper {

    public String zipString(String iniString) {
        // write code here
        int p2 = 0;
        int len = iniString.length();
        StringBuffer result = new StringBuffer();
        int count=0;
        for(int i=0; i<len; i++){
            p2 = i;
            count = 0;
            while(p2 < len){
                if(iniString.charAt(p2) == iniString.charAt(i)){
                    p2++;
                    count++;
                }else{
                    break;
                }
            }

            result.append(iniString.charAt(i) + String.valueOf(count));
            i=--p2;
        }
        return String.valueOf(result);
    }
}
