package com.company;
import java.util.*;
public class excep {
    public static void main(String[] args) {
        int[] num = {7,9,15,8,20,1};
        int len = num.length;
        TreeSet<Integer> st = new TreeSet<>();
        for(int i = 0;i<len;i++){
            st.add(num[i]);
        }

        System.out.println(st.last());
    }
}
