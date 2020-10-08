//import java.util.*;
//class TreeNodea {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//  }
//
//
//public class haoweilaitest {
//    /**
//     * 非递归遍历前序二叉树
//     * @param root TreeNode类 根节点
//     * @return string字符串
//     */
//    public static String notReCuPreOrder (TreeNode root) {
//        // write code here
//        Stack<TreeNode> stac  = new Stack<>();
//        if(root == null)
//            return "";
//        StringBuilder sb = new StringBuilder();
//        stac.push(root);
//        while(!stac.isEmpty()){
//            TreeNode temp = stac.pop();
//            sb.append(temp.val+',');
//            if(temp.right!= null)
//                stac.push(temp.right);
//            if(temp.left!=null)
//                stac.push(temp.right);
//        }
//        return "1";
//       // return sb.toString().substring(0,sb.length()-1)length();
//    }
//    public  static void  main(String[] arg){
//        TreeNode t = new TreeNode();
//        t.val = 1;
//
//        t.left.val =2;
//        t.right.val = 3;
//        String s = notReCuPreOrder(t);
//    }
//}