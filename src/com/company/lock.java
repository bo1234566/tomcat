package com.company;

public class lock implements Runnable{
    Object obj;
    public lock(Object o){
        this.obj=o;
    }
    @Override
    public void run() {
        synchronized (obj){
            System.out.println(1);
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ll implements Runnable{
    Object obj;
    public ll(Object o){
        this.obj=o;
    }
    @Override
    public void run() {
        synchronized (obj){
            System.out.println(1);
            obj.notify();
        }
    }
}
class Mai1n{
    public static void main(String[] args){
        Object obj=new Object();
        lock runnable1=new lock(obj);
        ll runnable2=new ll(obj);
        Thread t1=new Thread(runnable1);
        Thread t2=new Thread(runnable2);
        t1.start();
        t2.start();
    }
}