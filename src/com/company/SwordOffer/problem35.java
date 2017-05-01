package com.company.SwordOffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhzy on 2017/5/1.
 */
public class problem35 {

    public static void main(String[] args){
        String a = "zuDClOWjkPNhb";
        System.out.println(FirstNotRepeatingChar(a));
    }

    public static int FirstNotRepeatingChar(String str) {
        if(str == null){
            return -1;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chr = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(chr[i])){
                map.put(chr[i], 0);
            }else{
                map.put(chr[i], i);
            }
        }
        for(char key:map.keySet()){
            if(map.get(key) > 0){
                return map.get(key);
            }
        }
        return  0;
    }
}
