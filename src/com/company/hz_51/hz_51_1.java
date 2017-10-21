package com.company.hz_51;

import java.util.*;

public class hz_51_1{
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = scanner.nextInt();
        }
        Map<Integer, Integer> res = new HashMap<>();

        for(int i=0; i<n; i++){
            if(res.containsKey(num[i])){
                res.put(num[i], res.get(num[i]) + 1);
            }else {
                res.put(num[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> infoIds =
                new ArrayList<Map.Entry<Integer, Integer>>(res.entrySet());


        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o2.getValue() != o1.getValue()){
                    return o2.getValue() - o1.getValue();
                }else {
                    return (int)(o1.getKey() - o2.getKey());
                }
            }
        });

        System.out.println(infoIds.get(0).getKey());
    }

}