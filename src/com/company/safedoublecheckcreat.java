package com.company;

public class safedoublecheckcreat {
    private safedoublecheckcreat(){}
    private volatile static safedoublecheckcreat Instance;
    public static safedoublecheckcreat  getInstance(){
        if(Instance == null){
            synchronized (safedoublecheckcreat.class){
                if(Instance == null){
                    Instance = new safedoublecheckcreat();
                }
            }
        }
        return Instance;
    }
}
