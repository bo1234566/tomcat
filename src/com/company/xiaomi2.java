package com.company;

import java.util.Scanner;
import java.util.Stack;

public class xiaomi2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i<s.length();i++){
                if(stack.isEmpty() && (s.charAt(i) ==')'||s.charAt(i) == '}'||s.charAt(i) == ']')){
                    System.out.println("false");
                return;}
                if((s.charAt(i) ==')'&& stack.peek() == '(')) {
                    stack.pop();
                }

                if((s.charAt(i) =='}'&& stack.peek() == '{')) {
                    stack.pop();
                }

                if((s.charAt(i) ==']'&& stack.peek() == '[')) {
                    stack.pop();
                }
                stack.push(s.charAt(i));

            }

            if(stack.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
