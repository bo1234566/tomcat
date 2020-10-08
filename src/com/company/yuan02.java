package com.company;

import java.util.Scanner;

public class yuan02 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while (time > 0) {
            time--;
            sc.nextLine();
            String s = sc.nextLine();

            if (s.charAt(0) != '(') {
                System.out.println("invalid");
            } else {
                int index = 1;
                while (s.charAt(index) == ' ')
                    index++;
//                int right = index;
//                while(s.charAt(right)>='0'&& s.charAt(right)<='9'){
//                    right++;
//                }

                if (s.charAt(index) != '+' && s.charAt(index) != '-' && s.charAt(index) != '*') {
                    System.out.println("invalid");
                }
                int right = index;
                while (s.charAt(right) >= '0' && s.charAt(right) <= '9') {
                    right++;


                }

            }
        }
    }}