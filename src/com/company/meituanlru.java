package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class meituanlru{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Deque<Integer> que = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(que.contains(nums[i]))
                que.remove((Integer)(nums[i]));
            que.addFirst(nums[i]);
        }
        int size = que.size();
        for(int i = 0;i<size;i++)
            System.out.println(que.remove());
    }
}
