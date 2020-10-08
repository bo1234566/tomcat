package com.company;

import java.util.HashSet;
import java.util.Set;

public class cy02 {
    public static void main(String[] arg){
        String ss = "1110211";
        int left = 0;
        int right = 1;
        int start = 0;
        int end = 0;
        int len = 0;

        Set<Character> set = new HashSet<>();
        set.add(ss.charAt(0));
        for(;right<ss.length();right++){
            if(!set.contains(ss.charAt(right)))
                if(set.size()==2){
                    while(set.size()>1){
                        set.remove(ss.charAt(left));
                        left++;
                    }
                }

            else
            set.add(ss.charAt(right));
            if(len<right-left){
                len = right-left;
                start = left;
                end = right;
            }
        }
        String s = ss.substring(start,end);
    }
}
