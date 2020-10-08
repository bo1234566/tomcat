package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class duxiaoman01 {
    public  static  void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else
                map.put(s1.charAt(i),1);
        }
        int res = 0;
        for(int i = 0;i<s2.length();i++){
            if(map.containsKey(s2.charAt(i))){
                if(map.get(s2.charAt(i))!=0)
                res++;
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
        }
        System.out.println(res);
    }
}
