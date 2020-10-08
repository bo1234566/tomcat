package com.company;

public class proxytest {
    public static void main(String[] args) {
        smsservice smsService = new SmsServiceImpl();
        Smsproxy smsProxy = new Smsproxy(smsService);
        smsProxy.send("java");
    }
}
