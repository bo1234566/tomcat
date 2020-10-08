package com.company;

import java.util.Scanner;

public class qushi1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        if(s.length() == 0){
            System.out.println("");
            return;
        }
        int len = s.length();
        int left = 0;
        int right = 0;
        int time = 0;
        String sub = "";
        for(int i = 0;i<len;i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                num.append(s.charAt(i));
            }
            else{
                   if(num.length()>0){
                       time = Integer.valueOf(num.toString());
                        sub = s.substring(left,i-num.length());
                       while(time>0){
                           time--;
                           sb.append(sub);
                       }
                       left = i;
                       num.delete(0,num.length());
                   }
                }
        }
        sub = s.substring(left,len-num.length());
        time = Integer.valueOf(num.toString());
        while(time>0){
            time--;
            sb.append(sub);
        }
        System.out.println(sb.toString());
    }
}
