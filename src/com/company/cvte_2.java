package  com.company;
import  java.util.*;
public class cvte_2{
/*
* 4 5
0 1 15
1 2 15
0 3 50
1 3 30
2 3 10
3
样例输出
40
* */

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] road = new int[N][N];
        for(int i = 0 ; i < M ; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int t = scanner.nextInt();
            road[a][b] = t;
            road[b][a] = t;
        }
        int x = scanner.nextInt();
        min = Integer.MAX_VALUE;
        int[] flags = new int[N];
        flags[0] = 1;
        findPath(road, 0, x, flags, 0);
        System.out.println(min);
    }

    public static void findPath(int[][] path, int curIndex, int target, int[] flags, int sum){
        if(curIndex == target){
            min = Math.min(min, sum);
        }else{
            for(int i = 0; i < path.length;i++){
                if(flags[i] != 1 && path[curIndex][i] != 0 && path[curIndex][i] < min && sum < min){
                    flags[i] = 1;
                    sum += path[curIndex][i];
                    findPath(path, i, target, flags, sum);
                    sum -= path[curIndex][i];
                    flags[i] = 0;
                }
            }
        }
    }
}