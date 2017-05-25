package com.java_interview;

import java.util.Objects;

/**
 * Created by zhzy on 2017/5/25.
 */
public class Clone {

    public static void main(String[] args){
        Obj a = new Obj();
        Obj b = (Obj) a.clone();
        a.changeAInt();
        System.out.println("a:" + a.getaInt());
        System.out.println("b:" + b.getaInt());
    }

}


class Obj implements Cloneable{


    private int aInt = 0;

    public void changeAInt (){
        this.aInt = 1;
    }

    public int getaInt(){
        return aInt;
    }
    public void setaInt(int aInt){
        this.aInt = aInt;
    }

    public Object clone(){
        Object o = null;
        try{
            o = (Obj)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return o;
    }


}