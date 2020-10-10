
import java.util.*;
public class waitnotify {
public static Object lock = new Object();

    public static void main(String[] args) {
        Wait wait = new Wait();
        Notify notify = new Notify();
        Thread t1 = new Thread(wait);
        Thread t2= new Thread(notify);
        t1.start();
        t2.start();
    }

static class Wait implements Runnable{

    @Override
    public void run() {
        synchronized (lock){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait");
        }
    }
}
static class Notify implements Runnable{

    @Override
    public void run() {
        synchronized (lock){
            lock.notify();
        }
        synchronized (lock){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
                }
            }
        }
    }
}