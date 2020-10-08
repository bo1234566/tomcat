package com.company;

import java.util.*;

public class xiecheng_3 {
    public static int res = Integer.MAX_VALUE;
    public static int count = 0;
    public static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int e0 =sc.nextInt();
        int x = sc.nextInt();
        int L = sc.nextInt();
        int[][] num = new int[m][n];
        for(int i = 0;i<m;i++)
            for(int j = 0;j<n;j++){
                num[i][j] = sc.nextInt();
            }
        if(x == 0)
        dfs(num,0,0,m,n,e0+num[0][0]);
        System.out.println(res);
    }
    public static void dfs(int[][] num,int i,int j,int m,int n,int e0){
        if(i<0||i>=m||j<0||j>=n||e0<0){
            return;
        }
        if(i == (m-1)&&j == (n-1))
        {
            res = Math.min(res,count);
        }
        e0 = e0-num[i][j];
        for(int[] si:dir){
            dfs(num,i+si[0],j+si[1],m,n,e0);
//           List lis = new LinkedList();
//           Queue que = new PriorityQueue();
//           Set se = new EnumSet<>();
//           Map ma = new We();
//           Vector c = new Vector();
//           Stack sc = new Stack();
        }
    }
}
