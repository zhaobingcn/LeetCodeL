package com.company.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zhzy on 2017/8/16.
 */
public class problem2 {

    static Map<Integer, SecondNode> module = new HashMap<>();
    static Map<Integer, String> kk = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String a = scanner.nextLine();
            if(a.length() < 5){
                flag = false;
            }
//            System.out.print(a);
            String[] b =  a.replace("{", "").replace("}","").replaceAll(",","").split(" ");
            kk.put(toInt(b[0]), b[0]);
            kk.put(toInt(b[1]), b[1]);
            AddDependency(toInt(b[0]), toInt(b[1]));
        }


        int len = kk.size();
        int count = 0;
        for(Map.Entry<Integer, String> aentry: kk.entrySet()){
            count ++;
            System.out.print("{"+aentry.getValue()+", "+MouldeIsCycularDependency(aentry.getKey())+"},");
            if(count == len){
                System.out.print("{"+aentry.getValue()+", "+MouldeIsCycularDependency(aentry.getKey())+"}");
            }
        }

    }

    static void AddDependency(int ModuleId, int DependModuleId){
        module.put(ModuleId, new SecondNode(DependModuleId, false));
    }



    static boolean MouldeIsCycularDependency(int ModuleId){

        int flag = ModuleId;

        while (module.get(ModuleId).tag == false){
            module.get(ModuleId).tag =true;
            ModuleId = module.get(ModuleId).amoudle;
        }
        if(flag == ModuleId){
            return true;
        }
        return false;
    }

    static void clear(){
        module.clear();
    }

    static int toInt(String string){
        int b = Integer.parseInt(string.replaceAll("^0[x|X]", ""), 16);
        return b;
    }

    public static String bytes2String(byte[] b) throws Exception {
        String r = new String (b,"UTF-8");
        return r;
    }


    static class SecondNode{
        int amoudle;
        boolean tag;

        public SecondNode(int amoudle, boolean tag) {
            this.amoudle = amoudle;
            this.tag = tag;
        }
    }
}
