package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNodes{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNodes(int x) {
        val = x;
    }
}
public class sina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] nums = new int[s.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(s[i]);
        }
        TreeNode[] treenums = new TreeNode[nums.length+1];
        for(int i = 1;i<=nums.length;i++){
            TreeNode temp = new TreeNode(nums[i-1]);
            treenums[i] = temp;

        }
        int index = 1;
        while(index<=nums.length/2){
            treenums[index].left = treenums[2*index];
            treenums[index].right = treenums[2*index+1];
            index++;
        }
            TreeNode root = treenums[1];
        TreeNode res = upsideDownBinaryTree(root);
        Queue<TreeNode> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        que.add(res);

        while(!que.isEmpty()){
            TreeNode temp = que.poll();
            sb.append(temp.val);
            sb.append(",");
            if(temp.left!=null){
                que.add(temp.left);
            }
            if(temp.right!=null){
                que.add(temp.right);
            }
        }

            String w = sb.toString();
        System.out.println(w.substring(0,w.length()-2));
    }


    public static TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return root;
        }

        TreeNode leftRoot = upsideDownBinaryTree(root.left);

        TreeNode tmpNode = leftRoot;

        while(tmpNode.right != null) {
            tmpNode = tmpNode.right;
        }

        tmpNode.left = root.right;
        tmpNode.right = root;

        root.right = null;
        root.left = null;
        return leftRoot;
    }

}