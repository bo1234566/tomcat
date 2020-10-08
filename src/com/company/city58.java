package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class city58 {
    public static void main(String[] arg){

    }
    public ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();
        que.add(node);
        while (!que.isEmpty()) {
            int size = que.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size > 0) {
                size--;
                TreeNode temp = que.poll();
                list.add(temp.val);
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
            res.add(list);
        }
           return res;
    }
}
