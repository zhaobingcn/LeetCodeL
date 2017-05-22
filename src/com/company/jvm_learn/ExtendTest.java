package com.company.jvm_learn;

/**
 * Created by zhzy on 2017/5/22.
 */
public class ExtendTest {

    public int a = 8;

    public ExtendTest(int a){
        this.a = a;
    }

    public void increase(){
        for(int i=0; i<10; i++){
            a++;
        }
    }
}

class newExtend extends ExtendTest{

    public newExtend(int a) {
        super(a);
    }

    @Override
    public void increase(){
        for(int i=0; i<10; i++){
            a--;
        }
    }

    public void plus(){
        a = a*a;
    }

    public static void main(String[] args){
        newExtend a = new newExtend(8);
        a.increase();
        a.plus();
        System.out.print(a.a);
    }
}