public class DeadLock {
    public static  Object Lock1  = new Object();
    public static  Object Lock2  = new Object();
    public static og obg = new og();
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
class og{
    static void test(){
        System.out.println(11);
    }
    public synchronized   void test1(){
        System.out.println(1222);
    }

}
class Thread1 implements Runnable{
        @Override
        public void run() {
            while(true){
                synchronized (DeadLock.obg){
                    System.out.println("obg");
                    try {
                        Thread.sleep(6000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    class Thread2 implements Runnable{
        @Override
        public void run() {
            while(true){
//                synchronized (DeadLock.Lock2){
//                    System.out.println("lock2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    synchronized (DeadLock.Lock1){
//                        System.out.println("wait lock1");
//                    }
//                }
                DeadLock.obg.test1();
            }
        }
    }

