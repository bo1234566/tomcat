import sun.nio.ch.ThreadPool;

import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class threadState {
    public static void main(String[] args) {


    }
    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while(true){
                SleepUtils.second(1000);
            }
        }
    }
    static class Waiting implements Runnable{

        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try{
                        Waiting.class.wait();
                    }
                    catch (InterruptedException w){
                        w.printStackTrace();
                    }
                }
            }
        }
    }
   static class Blocked implements Runnable{


       @Override
       public void run() {
           synchronized (Blocked.class){
               while (true){
                   SleepUtils.second(100);
               }
           }
       }
   }

    }
class SleepUtils{
    public static final void second(long seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){}
    }


}
