package com.company;
import java.util.*;

public class wangyidate {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] man = sc.nextLine().split(" ");
        String[] woman = sc.nextLine().split(" ");
        int m = sc.nextInt();
        int[] A = new int[m];
        int[] B = new int[m];
        for(int i = 0;i<m;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt()-man.length;
        }
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                dp[i][j] = A[i-1] == B[j-1] ? dp[i-1][j-1] + 1 :Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        System.out.println(dp[A.length][B.length]);
    }
}
