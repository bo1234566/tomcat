import java.util.concurrent.ConcurrentHashMap;

public class testconstracter {
      testconstracter(){
        System.out.println("constracter");
    }
    public  void test(){
        System.out.println("test code");
    }
    public static void test1(){
        System.out.println("test1 before static");
    }
    static final int i = 11;
    static{
        System.out.println("static code");
    }
    {
        System.out.println("普通初始化块");
    }
    public static void main(String[] args) {
        System.out.println(testconstracter.i);
       // testconstracter tc = new testconstracter();

    }
}
class subclass extends testconstracter{
    subclass(){
        System.out.println("sub constracter");
    }
    static{
        System.out.println("static sub code ");
    }
    {
        System.out.println("sub 普通初始化");
    }

}
