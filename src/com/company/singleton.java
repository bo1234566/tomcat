package com.company;

public class singleton {
    private volatile static singleton uniqueInstance;

    private singleton() {

    }

    public static singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new singleton();
                }
            }

        }
        return uniqueInstance;
    }
}


/*
*
 * second
 *          private singleton(){}
 *          private  static final singleton INSTANCE = new singleton();
 *         public static singleton getInstance(){
 *         return INSTANCE;
 *         }
 * }
 *
*/


/**
 * third
 *     private  static  class  SingletonHolder{
 *         private static final singleton INSTANCE = new singleton();
 *     }
 *
 *     public static singleton getInstance(){
 *         return SingletonHolder.INSTANCE;
 *     }
 *     }
 */


