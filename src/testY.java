import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;

public class testY {

    private static int i = 1;
    public int getNext(){
        return i++;
    }
    String str = new String("good");
    char[] ch = {'a','b','c','d'};
    public static void main(String[] args) {

       int i;
       float f = 2.3f;
       double d = 2.7;
       i = ((int)Math.ceil(f)*((int)Math.round(d)));
        System.out.println(i);
}
    public static void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 't';
    }
}
class  Example{


}