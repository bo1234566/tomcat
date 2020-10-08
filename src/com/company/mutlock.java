package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class mutlock implements Runnable{

    static int i = 0;
   @Override
    public void run() {
      synchronized (mutlock.class){
         while(i<1000){
           i++;
        System.out.println(i);
       }
    }}

    public static void main(String[] args) throws ClassNotFoundException {

       int i = 0;
        Class<?> clazz = Class.forName("java.lang.String");

        System.out.println();;

        System.out.println(12);
}

}


