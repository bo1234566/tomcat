package com.company;

import java.util.*;

public class vivo {
    public static void main(String[] arg){
   String input = "1,2,-1,1";
    String res = compileSeq(input);
    }
    public  static  String compileSeq (String input) {
        // write code here
        Queue<int[]> que = new LinkedList<>();
        int[] a = {1,1};
        que.add(a);

        String[] num =  input.split(",");
        int[] nums  = new int[num.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<num.length;i++){
            nums[i] = Integer.valueOf(num[i]);
            map.put(i,nums[i]);
        }
        Arrays.sort(nums);
        List<List<Integer>> group = new ArrayList<>();

       for(int i = 0;i<nums.length;i++){
           int temp = nums[i];
           if(i!=0 && nums[i] == nums[i-1])
               continue;
           List<Integer> list = new ArrayList<>();
           for(int k:map.keySet()){
               if(map.get(k) == temp)
                   list.add(k);
           }
           group.add(list);
       }

       StringBuilder sb = new StringBuilder();
       for(int i = 0;i<group.size();i++){
           List<Integer> lis = group.get(i);
           for(int j = 0;j<lis.size();j++){
           sb.append(lis.get(j));
             if(lis.size() == 1 ||i !=group.size()-1){
                 sb.append(",");
             }}
         }
         return sb.toString();
    }

}
