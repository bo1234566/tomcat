package com.company;

import java.util.Scanner;

public class huaweibackpack {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int maxnum = 15;
        int len =7;
        int[] weight =  {2,5,8,2,5,4,6};
        int[] price = {3,4,8,9,1,6,9};

        int[][] dp = new int[len+1][maxnum+1];
        for(int i = 1;i<=len;i++)
            for(int j = 0;j<=maxnum;j++){
               if(j<weight[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else if(j-weight[i-1]<=maxnum)
                    //第i-1个物品为当前选择，减去i-1的重量后剩余的背包内最大价值加上当前第i-1个物品的价值
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+price[i-1]);
           }
        int res = dp[len][maxnum];
            System.out.println(res);
    }


}


