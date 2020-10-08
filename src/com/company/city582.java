package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class city582 {
    public static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];
        for(int i = 0;i<m;i++)
            for(int j = 0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        int ans = 0;
        Queue<int[][]> que = new LinkedList<>();
        for(int i = 0;i<m;i++)
            for(int j = 0;j<n;j++){
                if(nums[i][j] == 1){

                }
            }

        System.out.println(ans);
    }
}
