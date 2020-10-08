package com.company;

public class InstanceFactory {
    private static class InstanceHolder{
        public static InstanceFactory instance = new InstanceFactory();
    }
    public static InstanceFactory getInstance(){
        return InstanceHolder.instance;
    }
}
