package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class removeDuplicateLetters {
    public static void main(String[] arg) {
        String s = "bcabc";
        String res = removeDuplicateLetters(s);
        System.out.println(res);
    }

    public static String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> last_occurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            last_occurrence.put(s.charAt(i), i);
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(!seen.contains(c)){
            while (!stack.isEmpty() && stack.peek() > c && last_occurrence.get(stack.peek())>i) {

             seen.remove(stack.pop());
            }
//
            stack.push(c);
            seen.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char i : stack)
            sb.append(i);
        return sb.toString();

    }
}