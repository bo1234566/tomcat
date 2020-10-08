package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class xiecheng {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s20 = sc.nextLine();
        String s22 = sc.nextLine();
        String s3 = sc.next();
        String[] s2 = s22.split(",");

        int len = s2.length;

        StringBuilder sb =  new StringBuilder();
        for(int j = 0;j<len;j++)
        {
            String[] temp = s2[j].split(" ");
            for(int i = 0;i<temp.length;i++){
                if(judge(s1,temp[i]))
                    sb.append(s3);
                 else
                    sb.append(temp[i]);
                 if(i!=temp.length-1)
                 sb.append(" ");
                }
            sb.append(",");
            }
        }
        public static boolean judge(String s1,String s2){
          char[] count = new char[256];
            for(int i = 0;i<s1.length();i++){
                count[s1.charAt(i)]++;
            }
            for(int i = 0;i<s2.length();i++){
                count[s2.charAt(i)]--;
            }
            for(int j = 0;j<count.length;j++){
                if(count[j]!=0)
                    return false;
            }
            return true;
        }

    }

