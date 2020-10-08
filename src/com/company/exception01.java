package com.company;

import javax.swing.*;
import java.util.List;

public   class exception01  implements  Is<String> {
    public static void main(String[] args) {
v vv = new v();

        C<Object> cc = new C<Object>();

        ss<Object> DD = new ss ();
        Object sd = null;
        Object s9 = DD.R(sd);
        
    }

    @Override
    public String tests(String t) {
        return t;
    }
}
class ss<E> {


    public <T> void test1s(T t) {
    T t22 = t;
    }
    public<T> T R(T S){
        return  S;
    }

    /**
     *
     * @param strs
     * @param <T>
     */
    public <T> void ts(T... strs){
        for(T s: strs){
            System.out.println(s);
        }
    }
}
class C<T> implements Is<T>{

    @Override
    public T tests(T t) {
        return null;
    }
}
class v implements Is<Integer>{

    @Override
    public Integer tests(Integer integer) {
        return null;
    }
}


//class B{
//    int i;
//    public void test()throws Exception{
//        B b = null;
//        System.out.println(b.i);
//    }
//        }
