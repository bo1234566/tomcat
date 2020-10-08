package com.company;

public class Smsproxy implements  smsservice {
    private final  smsservice smsservice;
    public Smsproxy(smsservice smsservice){
        this.smsservice = smsservice;
    }
    @Override
    public  String send(String message){
        System.out.println("before method send()");
        smsservice.send(message);
        System.out.println("after method send()");
        return  null;
    }

}
