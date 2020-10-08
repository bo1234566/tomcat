package com.company;

public class SmsServiceImpl implements smsservice {
    public String send(String message){
        System.out.println("Send message" +message);
        return message;
    }
}
