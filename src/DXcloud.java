import java.util.Scanner;

public class DXcloud {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(",");
        int len = in.length;
        int[] nums = new int[len];
        for(int i = 0;i<len;i++){
            nums[i] = Integer.valueOf(in[i]);
        }
        int[] dp = new int[len];
        if(len == 0)
            System.out.println(0);
        dp[0] = nums[0];
        if(len>=2)
            dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<len;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        System.out.println(dp[len-1]);
    }
}
