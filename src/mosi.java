import java.util.Scanner;

public class mosi {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int[] dp = new int[len];
        if(len == 1)
            System.out.println(1);
        if(len == 2)
        {
            if(str.charAt(0) == '0')
                System.out.println(1);
            else
                System.out.println(2);
        }
        if(len>=3){
        dp[0] = 1;
        if(str.charAt(0) == '0')
            dp[1] = 1;
        else
            dp[1] = 2;
        if(str.charAt(0) != '0')
            dp[2] =  dp[2]+1;
        if(str.charAt(1)!='0')
            dp[2] = dp[2]+dp[0];
        dp[2] = dp[2]+dp[1];

        for(int i = 3;i<len;i++){
            if(str.charAt(i-2)!='0')
                dp[i]+=dp[i-3];
            if(str.charAt(i-1)!='0')
                dp[i]+=dp[i-2];

                dp[i]+=dp[i-1];
        }
            System.out.println(dp[len-1]);
        }

    }
}
