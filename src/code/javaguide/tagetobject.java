package code.javaguide;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public  class tagetobject {
    public class inner{
        int s = 1;
         void meth(){
             ssss = 1;
             values = "ss";
            System.out.print(values);
        }
    }
    public static class innerstatic{
        int s =1;
        static int ss = 2;
         void meth(){
             values = "ss";
            System.out.print(sss);
        }
    }
   static   int sss  = 2;
       int ssss  = 2;
    public static void main(String[] args) {
       tagetobject.innerstatic in = new tagetobject.innerstatic();
        tagetobject to=new tagetobject();
        inner ins = to.new inner();
        innerstatic.ss = 22;

    }
    private   String value;
    private  static  String values;
    public tagetobject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love public " + s);
    }

    private void privateMethod() {
        System.out.println("value is private" + value);
    }
}
class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的Class对象并且创建TargetObject类实例
         */
      Class<?> targetClass = Class.forName("code.javaguide.tagetobject");
      tagetobject targetObject = (tagetobject) targetClass.newInstance();

      Method[] methods = targetClass.getDeclaredMethods();
      for(Method method:methods){
          System.out.println(method.getName());
      }
      Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
      publicMethod.invoke(targetObject,"javaguide");

      Field field = targetClass.getDeclaredField("value");
      field.setAccessible(true);
      field.set(targetObject,"Javaguide");

      Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
      privateMethod.setAccessible(true);
      privateMethod.invoke(targetObject);

    }
}

