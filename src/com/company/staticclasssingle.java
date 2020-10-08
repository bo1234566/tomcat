package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class staticclasssingle {
    private    staticclasssingle(){}
    private static class singleHolder{
        public  singleHolder(){
           System.out.println(11);
        }
        private static final staticclasssingle Instance = new staticclasssingle();
    }
    public staticclasssingle getInstance(){
        return singleHolder.Instance;
    }

    public static void main(String[] arg){


       int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }
    }
}
