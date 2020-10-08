package com.company;

import java.util.Scanner;

public class hwl {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int len = s.length();
            int ans = 0;


            while(len!=0){
                ans++;
                len = len-2;
            }
            System.out.println(ans);

        }

}
