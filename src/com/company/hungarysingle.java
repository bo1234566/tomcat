package com.company;

public class hungarysingle {
    private hungarysingle(){}
    private  static hungarysingle instance = new hungarysingle();
    public static hungarysingle getInstance(){
        return instance;
    }
}
