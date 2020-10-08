package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class bintree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        TreeNode root=buildTree(str);
    }
    public static TreeNode buildTree(String str){
        String[] arr=str.split(",");
        int[] nums=new int[arr.length+1];
        for(int i=1;i<=arr.length;i++){
            nums[i]=Integer.valueOf(arr[i-1]);
        }
        int n=nums.length;
        ArrayList<TreeNode> list=new ArrayList<>();
        list.add(null);
        list.add(new TreeNode(nums[1]));
        TreeNode root=null;
        for(int i=1;i<n;i++){
            TreeNode tmp=list.get(i);
            if(root==null) root=tmp;
            int left=2*i;
            int right=2*i+1;
            TreeNode leftNode=null;
            TreeNode rightNode=null;
            if(left<n) {
                leftNode=new TreeNode(nums[left]);
            }
            if(right<n){
                rightNode=new TreeNode(nums[right]);
            }
            tmp.left=leftNode;
            tmp.right=rightNode;
            list.add(leftNode);
            list.add(rightNode);
        }
        return root;
    }
}