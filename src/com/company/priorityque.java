package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityque {
   public static void main(String[] arg){

       int k = 2;
       int[] nums = {3,2,1,5,6,4};
   int s = solution(nums,k);

   }
   public static int solution(int[] nums,int k){
       Queue<Integer> que = new PriorityQueue<>();
       for(int i = 0;i<nums.length;i++){
           que.add(nums[i]);
           if(que.size()>k){
               que.poll();
           }
       }
       return que.peek();
   }
}
