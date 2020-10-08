package com.company;
import java.util.*;
public class beiketest2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int left=0;
        int right=n-1;
        int sub1End=right-1;
        int len=sub1End-left+1;
        while(right>0){
            if(right==1){
                int a=1;
            }
            if(right+len-1>=n){
                right--;
                right--;
                sub1End=right-1;
                len=sub1End-left+1;
            }
            else if(right+len-1<n && !str.substring(0,right).equals(str.substring(right,right+len))){
                right--;
                sub1End=right-1;
                len=sub1End-left+1;
            }
            else if(right+len-1<n && str.substring(0,right).equals(str.substring(right,right+len))){
                break;
            }
        }
        if(right==0){
            System.out.println(n);
            return;
        }
        int ans=right+1+n-1-right-len+1;
        System.out.println(ans);
    }
}
