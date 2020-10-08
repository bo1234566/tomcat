package com.company;

import java.util.Scanner;

public class shunzi {
    public static void main(String[] arg){
        Scanner sc  = new Scanner(System.in);
        String[] snums = sc.nextLine().split(" ");
        int len = snums.length;

        int[] nums = new int[len];
        for(int i =0;i<len;i++){
            if(snums[i].charAt(0) == 'A'){
                nums[i] = 1;
            }
            if(snums[i].charAt(0) == 'T'){
                nums[i] = 10;
            }
            if(snums[i].charAt(0) == 'J'){
                nums[i] = 11;
            }
            if(snums[i].charAt(0) == 'Q'){
                nums[i] = 12;
            }
            if(snums[i].charAt(0) == 'K'){
                nums[i] = 13;
            }
            else
                nums[i] =snums[i].charAt(0)-'0';

        }
        System.out.println("False");

}
}
