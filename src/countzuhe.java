import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
public class countzuhe {
    public static int count = 0;
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] dp = new int[m+1];
        for(int i = 3;i<=n;i++){
            for(int j = m-1;j>m/2;j--)
                count+=j/2;
        }
        if(n == 3)
            System.out.println(count+1+m/2);
        else
            System.out.println(1+m/2);

    }

}
