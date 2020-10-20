package code.javaguide;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class xdftest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        String ss = sc.nextLine();
        String sss = sc.nextLine();
        System.out.println(new B().getValue());
        Set<Integer> ste = new HashSet<>();
    }
    static class A{
        protected  int value;
        public A(int v){
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;

            }
            finally {
                this.setValue(value);
                System.out.println(value);
            }
        }

    }
    static  class B extends A{
        public B(){
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value){super.setValue(2*value);
        }

    }
}
