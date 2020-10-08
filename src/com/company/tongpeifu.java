package com.company;

import java.util.ArrayList;
import java.util.List;

public class tongpeifu {
    public static void main(String[] args) {
        Dd  d = new Dd();
        List<String> lsit= new ArrayList<>();
        d.test(lsit);
        List<Object> ll = new ArrayList<>();
        d.test(ll);

        List<C1> llS = new ArrayList<>();
        List<B1> lS1 = new ArrayList<>();
        List<D1> lS2 = new ArrayList<>();
        List<w> ww = new ArrayList<w>();
        d.test3(ww);
        d.test1(llS);
        d.test(llS);
        d.test2(lS1);
        d.test1(lS2);
    }
}
class Dd{
    public void test(List<?> list){}
    public void test1(List<? extends C1> list){}
    public void test2(List<? super C1> list){}
    public void test3(List<? extends IA> list){}
}
class A1{

}
class w implements IA{

}
interface IA{}
class B1 extends A1{}
class C1 extends B1{}
class D1 extends C1{}