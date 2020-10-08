package com.company;

public class hunery {
    private hunery(){}
    private static hunery instance  = new hunery();
    public static hunery getInstance(){
        return instance;
    }

}
