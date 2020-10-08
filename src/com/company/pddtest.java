package com.company;

import java.util.*;

public class pddtest {
    private static Set<Integer> set = new HashSet<>();
    private static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] specialnum = new int[m];
        for(int i = 0;i<m;i++){
            specialnum[i] = sc.nextInt();
        }
        dfs(specialnum,0);
        int ans = 0;
        for(int i = 0;i<m;i++){
            ans = ans+n/specialnum[i];
        }
        for(int s:set){
            ans = ans-n/s;
        }
        System.out.println(ans);
    }
    public static void dfs(int[] nums,int count){
        if(list.size() >=2){
            set.add(method(list));
        }
        if(count == nums.length)
            return;

        for(int i = count;i<nums.length;i++){
            list.add(nums[i]);
            dfs(nums,i+1);
            list.remove(list.size()-1);
        }
    }
    public static int  method( List<Integer> list){
        int res = 1;
        for(int i = 0;i<list.size();i++){
            res = res*list.get(i);
        }
        return res;
    }
}
