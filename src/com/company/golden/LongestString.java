package com.company.golden;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

/**
 * Created by zhzy on 2017/5/15.
 */
public class LongestString {

    public int getLongest(String[] str, int n) {
        // write code here
        HashMap<String, Boolean> map = new HashMap<>();
        for(String s:str){
            map.put(s, true);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        for(String s:str){
            if(canBuildWord(s, true, map)){
                return s.length();
            }
        }

        return 0;
    }

    boolean canBuildWord(String str, boolean isOriginal, HashMap<String, Boolean> map){

        if(map.containsKey(str) && !isOriginal){
            return map.get(str);
        }

        for(int i=1; i<str.length(); i++){
            String left = str.substring(0, i);
            String right = str.substring(i);
            if(map.containsKey(left) && map.get(left) == true && canBuildWord(right, false, map)){
                return true;
            }
        }
        map.put(str, false);
        return false;
    }
}
