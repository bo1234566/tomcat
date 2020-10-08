package com.company;

public class static01 {
    private static01(){
    }
    private volatile static static01 Instance;
    public static static01 getInstance(){
        if(Instance == null){
            synchronized (static01.class){
                if(Instance == null){
                    Instance = new static01();
                }
            }
        }
        return  Instance;
    }
}
