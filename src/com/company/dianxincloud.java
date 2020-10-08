package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class dianxincloud {
    public static void main(String[] arg){
        List<Number> number = new ArrayList<Number>();
        number.add(314);
        get(number);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> hashmap = new HashMap<>();
        int len = s.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<len;i++){
            if(hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
            }
            else
                hashmap.put(s.charAt(i),1);

        }
        for(Character k:hashmap.keySet()){
            if(hashmap.get(k)<min){
                min = hashmap.get(k);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(hashmap.get(s.charAt(i)) == min)
                continue;
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public  static void get(List<? extends Number> data){
        System.out.println("at"+data.get(0));
    }
}
