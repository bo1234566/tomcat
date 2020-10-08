package com.company;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] strnum = sc.nextLine().split(" ");
       int[] nums = new int[strnum.length];
       for(int i =0;i<strnum.length;i++){
           nums[i] = Integer.valueOf(strnum[i]);
        }
       List<List<Integer>> list = threeSum(nums);
       for(int i = 0;i<list.size();i++){
           List<Integer> temp = list.get(i);
           for(int j = 0;j<temp.size();j++){
               System.out.print(temp.get(j)+" ");
           }
           System.out.println(" ");
       }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        if(nums.length == 0)
            return res;
        int len = nums.length;
        for(int first = 0;first<len;first++){
            if(first!=0 && nums[first] == nums[first-1])
                continue;
            int target = -nums[first];
            int thrid = len-1;
            for(int second = first+1;second<len;second++){
                if(second !=first+1 && nums[second] == nums[second-1])
                    continue;
                while(second<thrid && nums[second]+nums[thrid]>target)
                    thrid--;
                if(second == thrid)
                    break;
                if(nums[second]+nums[thrid] == target){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[thrid]);
                    res.add(list);
                }
            }

        }
        return  res;

    }
}
