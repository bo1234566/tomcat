package com.company;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class slideWindow {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.next().split(",");
        Deque<Integer> slideQueueWindow = new LinkedList<>();
        int lenOfnums = in.length;
        int lengthOfwindow = 3;
        int[] nums = new int[in.length];
        int[] res = new int[in.length-2];
        int resIndex = 0;
        for(int i = 0;i<lenOfnums;i++){
            nums[i] = Integer.valueOf(in[i]);
        }
        for(int i = 0;i<lenOfnums;i++){
            while(!slideQueueWindow.isEmpty() && nums[slideQueueWindow.getLast()]<nums[i]){
                slideQueueWindow.removeLast();
//                slideQueueWindow.addLast(i);
            }
            if(!slideQueueWindow.isEmpty() &&slideQueueWindow.getFirst() ==(i-lengthOfwindow)){
                slideQueueWindow.removeFirst();
            }
            slideQueueWindow.addLast(i);
            if(i>=2)
            res[resIndex++] = nums[slideQueueWindow.getFirst()];

        }
        for(int i = 0;i<lenOfnums-2;i++)
            System.out.print(res[i]+" ");
    }
}
