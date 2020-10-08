import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int x){
        val= x;
    }
}
public class buildtree {

public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

    TreeNode[] a = new TreeNode[10];
    for(int i = 0;i<3;i++){
        int root = sc.nextInt();
        String str = sc.next();
        int child = sc.nextInt();
        if(a[root-1]==null)
         a[root-1] = new TreeNode(root);
        if(a[child-1]==null)
            a[child-1] = new TreeNode(child);
        if(str.equals("left")){
            a[root-1].left = a[child-1];
        }
        if(str.equals("right")){
            a[root-1].right = a[child-1];
        }
    }
    System.out.println(a[0].left.right == null);
System.out.println(a[0].left == null);
    }
}
