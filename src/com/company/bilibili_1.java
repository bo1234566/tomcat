package com.company;

import java.util.HashMap;

public class bilibili_1 {
public  static void main(String[] arg){
    int res = GetFragment("aaabbaaac");
    }
    public static int GetFragment (String str) {
        // write code here
        char[] charnum = str.toCharArray();
        int count = 0;
        int time = 0;
        int left = 0;

        while(left<charnum.length){
            int right = left;
            while(right<charnum.length && charnum[left] == charnum[right])
            {
                right++;
            }
            count+=right-left;
            time++;
            left = right;
        }
        return count/time;
    }
}


