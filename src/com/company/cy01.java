package com.company;


import java.util.*;
import static java.lang.Integer.*;

public class cy01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        char[] nums = s.toCharArray();

        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int start=0;
        int end=2;
        while(r<nums.length){
            if(map.containsKey(nums[r])){
                map.put(nums[r],map.get(nums[r])+1);
                r++;
            }else{
                map.put(nums[r],1);
                if(map.get('a')%2==1 || map.get('b')%2==1 || map.get('c')%2==1
                || map.get('x')%2==1 || map.get('y')%2==1 || map.get('z')%2==1){
                    int cnt = map.get(nums[l]);
                    if(cnt<=1){
                        map.remove(nums[l]);
                    }else{
                        map.put(nums[l],map.get(nums[l])-1);
                    }
                    l++;
            }
             }
            if(map.get('a')%2==0 && map.get('b')%2==0 && map.get('c')%2==0&& map.get('x')%2==0&& map.get('y')%2==0)
            {if(r-l>end-start){
                start=l;
                end=r;
            }
            }
        }
        for(int i=start;i<end;i++){
            System.out.print(nums[i]);
        }
    }
}
