package com.company;

public class consafecount {
    int count = 0;
    public  static Object lock=new Object();
    public static void main(String[] arg) {

        consafecount cs = new consafecount();
        MyFirstRunnable instance2=cs.new MyFirstRunnable();
        MyFirstRunnable instance3=cs.new MyFirstRunnable();
        MyFirstRunnable instance1 = cs.new MyFirstRunnable();
       for(int i=0;i<6;i++) {
           new Thread(instance1).start();
           new Thread(instance2).start();
       }

        }

    class MyFirstRunnable implements Runnable {


        public void run() {

            while (true) {
                //synchronized (MyFirstRunnable.class)锁住的是整个MyRunnable类
                //synchronized(this)锁住的是this对象
                synchronized (lock) {
                    if (count >= 100) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ":count:" + (++count));
                    //测试时，线程更容易切换
                    Thread.yield();
                }
            }
        }
    }
}

