package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int time = sc.nextInt();
        while(time>0){
            time--;
            int que = sc.nextInt();
            int left  = 0;
            int right = n-1;

            boolean flag  =false;
            while(left<right){
                int mid = left+(right-left+1)/2;
                if(num[mid]== que){
                    flag = true;
                    System.out.println(que);
                    break;
                }
                if(num[mid]>que)
                    right = mid-1;
                else
                    left = mid;
            }
            if(!flag)
                System.out.println(num[left]);
        }
    }

}