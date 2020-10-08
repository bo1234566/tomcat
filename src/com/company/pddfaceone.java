package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
public static class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }


    public static void main(String[] arg) {

       TreeNode roots = new TreeNode(1);
        TreeNode roots_left = new TreeNode(2);
        TreeNode roots_right = new TreeNode(2);
        roots.left = roots_left;
        roots.right = roots_right;
        pathSumStart(roots,3);
    }
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static void pathSumStart(TreeNode root,int sum){
       if(root.left == null && root.right == null){
           if(sum == root.val){
               list.add(root.val);
               res.add(new ArrayList<>(list));
               list.remove(list.size()-1);
           }
       return;
       }
       list.add(root.val);
      pathSumStart(root.left,sum-root.val);
       pathSumStart(root.right,sum-root.val);
        list.remove(list.size()-1);

    }
}
