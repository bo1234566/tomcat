package com.company;

import java.util.Scanner;
import java.util.Stack;

public class minstack {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while(time>0){
            time--;
            String[] com = sc.nextLine().split(" ");
            if(com.length == 1){
                if(com[0].equals("pop"))
                    pop();
                if(com[0].equals("top"))
                    System.out.println(top());
                if(com[0].equals("getMin"))
                    System.out.println(getMin());
            }
            else{
                push(Integer.valueOf(com[1]));
            }
        }
    }
   public static  Stack<Integer> stc = new Stack<>();
    public static  Stack<Integer> minstc = new Stack<>();
    public static void pop(){
        stc.pop();
        minstc.pop();
    }
    public static int top(){
        return stc.peek();
    }
    public static void push(int x){
        stc.push(x);
        if(minstc.isEmpty()){
            minstc.push(x);
        }
        else if(minstc.peek()<x){
            minstc.push(minstc.peek());

        }
        else
            minstc.push(x);
    }
    public static int  getMin(){

        return minstc.peek();
    }
}
