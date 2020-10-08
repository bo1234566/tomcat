package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class cloneexample {
    private int[] arr;

    public cloneexample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public cloneexample(cloneexample original){
      int[] res =  original.arr;
        for(int i = 0;i<original.arr.length;i++){

        }
    }
    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }
    public static void main(String[] arg){
        cloneexample e1 = new cloneexample();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.poll();
        stack.peek();

        Queue<Integer> stacsk = new ArrayDeque<>();
        stack.push(1);
        stack.poll();
        stack.peek();
        StringBuilder sb = new StringBuilder();

     String s = "1";
        e1.set(2, 222);
        cloneexample e2 = new cloneexample(e1);
        e1.set(2, 222);
        System.out.println(e2.get(2));
    }

}

