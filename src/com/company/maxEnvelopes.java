package com.company;

import java.util.Arrays;

public class maxEnvelopes {
    public static void main(String[] arg){

//        int[][] Envelopes = new int[6][2];
        int[][] Envelopes = {{4,5},{4,6},{2,3},{6,7},{1,1}};
        int res = maxEnvelopes(Envelopes);

        System.out.println(res);
    }
    public static int maxEnvelopes(int[][] Envelopes){
        Arrays.sort(Envelopes,(o1,o2)->o1[0] == o2[0]?o2[1]-o1[1]:o1[0]-o2[0]);
        int[] secondDim = new int[Envelopes.length];
        for(int i = 0;i<Envelopes.length;i++){
            secondDim[i] = Envelopes[i][1];
        }
        int res = 0;
        int[] dp = new int[secondDim.length];
        for(int i = 0;i<secondDim.length;i++){
            int left  = 0;
            int right = res;
            while(left<right){
                int mid = left+(right-left)/2;
                if(dp[mid]<secondDim[i]){
                    left = mid+1;
                }
                else
                    right = mid;
            }

            if(left == res) res++;
            dp[left] = secondDim[i];
        }
        return res;
    }
}
