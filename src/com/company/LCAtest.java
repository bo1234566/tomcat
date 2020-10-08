package com.company;
class TreeNode{
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int x){
        this.val = x;
    }
}
public class LCAtest {
    static boolean f1 = false;
    static boolean f2 = false;
    static TreeNode res = null;

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        //System.out.println("Hello World!");
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
//        TreeNode p = root.left;
//        TreeNode q = root.right;
        TreeNode notexit = new TreeNode(15);
        TreeNode notexit2 = new TreeNode(15);
        solution(root, notexit2,root.left);
        if (res != null)
            System.out.println(res.val);
        else
            System.out.println("can not find LCA");
    }
        public static TreeNode solution(TreeNode root,TreeNode p,TreeNode q){
            if (root == null)
                return null;
            TreeNode left = solution(root.left, p, q);
            TreeNode right = solution(root.right, p, q);
            if ((left == p && right == q) || (right == p && left == q) || (root == p && (left == q || right == q)) || (root == q && (left == p || right == p))) {
                res = root;
                return root;
            }
            if (root == p)
                return p;
            if (root == q)
                return q;

            if (left == p || right == p)
                return p;
            if (left == q || right == q)
                return q;
            return null;

        }

}