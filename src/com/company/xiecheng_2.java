package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xiecheng_2 {
  private  static  List<String> res = new ArrayList<>();
  private  static  StringBuilder sb = new StringBuilder();
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] strnum = sc.nextLine().split(" ");
        dfs(strnum,0);
        for(int i = 0;i<res.size();i++){
            if(judge(res.get(i)))
            System.out.println(res.get(i)+"--circular dependency");
            else
                System.out.println(res.get(i));
        }

    }
    public static void dfs(String[] strnum,int start){
        if(start == strnum.length){
            res.add(sb.toString());
            return;
        }

            String temp = strnum[start];
            for(int j = 0;j<temp.length();j++){
                sb.append(temp.charAt(j));
                dfs(strnum,start+1);
                sb.delete(sb.length()-1,sb.length());
            }

    }
    public static boolean judge(String str){
        char[] num = new char[256];
        for(int  i = 0;i<str.length();i++){
            num[str.charAt(i)]++;
        if(num[str.charAt(i)]>1)
            return true;}
        return  false;
    }
}
