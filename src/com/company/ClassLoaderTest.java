package com.company;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         ClassLoader loader  = new ClassLoader() {
             @Override
             public Class<?> loadClass(String name) throws ClassNotFoundException {
                 try {
                     int idx=name.lastIndexOf(".");
                     String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
                     InputStream is = getClass().getResourceAsStream(fileName);
                     if(is == null){
                         return super.loadClass(name);
                     }
                     byte[] b = new byte[is.available()];
                     is.read(b);
                     return defineClass(name,b,0,b.length);
                 }
                 catch (IOException e){
                     throw new ClassNotFoundException();
                 }
             }
         };
         String className = "com.company.ClassLoaderTest";
         Object o1 = ClassLoaderTest.class.getClassLoader().loadClass(className).newInstance();
         Object o2 = loader.loadClass(className).newInstance();
        System.out.println(o1.getClass().getClassLoader());
        System.out.println(o2.getClass().getClassLoader());
         System.out.println(o1.equals(o2));
        System.out.println(o1 instanceof com.company.ClassLoaderTest);
        System.out.println(o2 instanceof com.company.ClassLoaderTest);
        System.out.println(o2 instanceof ClassLoaderTest);
    }
}

