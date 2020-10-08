public class DeadLock {
    public static final String Lock1 = "Lock1";
    public static final String Lock2 = "Lock2";

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();
        Thread1 instance1 = new Thread1();
        Thread2 instance2 = new Thread2();
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
    }

}
class Thread1 implements Runnable{
        @Override
        public void run() {
            while(true){
                synchronized (DeadLock.Lock1){
                    System.out.println();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (DeadLock.Lock2){
                        System.out.println();
                    }
                }
            }
        }
    }
    class Thread2 implements Runnable{
        @Override
        public void run() {
            while(true){
                synchronized (DeadLock.Lock2){
                    System.out.println();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (DeadLock.Lock1){
                        System.out.println();
                    }
                }
            }
        }
    }

