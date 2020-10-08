package com.company;
// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baidudfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
        T--;
        Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int  ans = 0;
        for(int i = 0;i<m;i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                for (int z = x; z <= y; z++) {
                    if (map.containsKey(z)) {
                        map.put(z, map.get(z) + 1);
                    } else
                        map.put(z, 1);
                }
            }
        }
        int[] res = new int[n];
        for(int i = 1;i<=n;i++){
            if(map.containsKey(i) && map.get(i) == m){

                res[ans] = i;
                ans++;
            }
        }

        System.out.println(ans);
        for(int i = 0;i<ans;i++){
            if(i == ans-1)
                System.out.print(res[i]);
            else{
            System.out.print(res[i]);
            System.out.print(' ');
        }}
        }
    }
}