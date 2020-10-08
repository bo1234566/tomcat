package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class meituantree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] nums=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(nums[i]==2){
                    System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            if(flag) continue;
            for(int i:map.keySet()){
                if(i!=1){
                    int count=map.get(i);
                    count--;
                    map.put(map.get(i),count);
                    int count1=map.get(1);
                    count1=count1-count;
                    map.put(1,count1);
                }
            }
            if(map.get(1)==0){
                System.out.println("YES");
            }
            else if(map.get(1)!=0){
                System.out.println("NO");
            }
        }
    }
}