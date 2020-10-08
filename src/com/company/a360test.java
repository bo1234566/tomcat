package com.company;

import java.util.Scanner;

public class a360test {
    public static void main(String[] arg){
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            String ss = sc.next();
            if(ss.length()<8){
                System.out.println("Irregular password");
            continue;
            }
            int daxie = 0;
            int xiaoxie = 0;
            int teshu = 0;
            int shuzi = 0;
            for(int i = 0;i<ss.length();i++){
                if(ss.charAt(i)>='0' && ss.charAt(i)<='9')
                    shuzi++;
                if(ss.charAt(i)>='a' && ss.charAt(i)<='z')
                    xiaoxie++;
                if(ss.charAt(i)>='A' && ss.charAt(i)<='Z')
                    daxie++;
            }
            if(shuzi<1||daxie <1||xiaoxie <1)
                System.out.println("Irregular password");
           else if(shuzi+daxie+xiaoxie == ss.length())
                System.out.println("Irregular password");
            else
                System.out.println("OK");

        }
    }
}
