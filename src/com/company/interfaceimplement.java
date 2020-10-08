package com.company;

public class interfaceimplement   implements testInterface  {
//    @Override
//    public void test1() {
//        System.out.println("test1");
//    }

    @Override
    public void test2() {
        System.out.println("test2");
    }


    public static void main(String[] arg){
        interfaceimplement ifp = new interfaceimplement();
        //ifp.test();
        ifp.test2();
       //ifp.test1();
    }
}
