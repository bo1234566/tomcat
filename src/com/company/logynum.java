package com.company;

import java.util.Scanner;

public class logynum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int[] nums = new int[x];
        nums[0] = 1;
        if(x<=6){
            System.out.println(x);
        return;
        }
        for(int i = 1;i<x;i++){
            int next2 = nums[a]*2;
            int next3 = nums[b]*3;
            int next5 = nums[c]*5;
            nums[i] = Math.min(next2,Math.min(next3,next5));
            if(nums[i] == next2)
                a++;
            if(nums[i] == next3)
                b++;
            if(nums[i] == next5)
                c++;
        }
        System.out.println(nums[x-1]);
    }
}
