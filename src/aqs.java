import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class aqs {
public static int m = 0;
public static Lock lock = new ReentrantLock ();

    public static void main(String[] args) throws InterruptedException {
//        Thread[] ths = new Thread[10];
//        for(int i = 0;i<ths.length;i++){
//            ths[i] = new Thread(()->{
//                try {
//                    lock.lock();
//                    for(int j = 0;j<100;j++)
//                        m++;
//                }finally {
//                    lock.unlock();
//                }
//            });
//        }
//        for(Thread t:ths) t.start();
//        for(Thread t:ths) t.join();
//        System.out.println(m);
        System.out.println(Math.round(-1.5));


    }
}
