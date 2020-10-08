package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class huaweidfsTobfs {
    private static int ans = 0;
    private static  int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] arg) {
        char[][] input = {{'1', '1', '0'}, {'0', '0', '1'}, {'0', '0', '0', '1'}, {'0', '0', '1', '0'}};
        int res = numIslands(input);
    }

    public static int numIslands(char[][] charmap) {

        if (charmap.length == 0)
            return 0;
        int m = charmap.length;
        int n = charmap[0].length;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (charmap[i][j] == '1') {
                    ans++;
                    charmap[i][j] = '0';
                    Queue<Integer> que = new LinkedList<>();
                    que.add(i*n+j);
                    while(!que.isEmpty()){
                        int id = que.remove();
                        int row = id/n;
                        int col = id%n;
                        if(row-1 >=0 && charmap[row-1][col] == '1'){
                            que.add((row-1)*n+col);
                            charmap[row-1][col] = '0';
                        }
                        if(row+1<m && charmap[row+1][col] == '1')
                        {
                            que.add((row+1)*n+col);
                            charmap[row+1][col] = '0';
                        }
                        if(col-1<0 && charmap[row][col-1] == '1')
                        {
                            que.add((row)*n+col-1);
                            charmap[row][col-1] = '0';
                        }
                        if(col+1<n && charmap[row][col+1] == '1')
                        {
                            que.add((row)*n+col+1);
                            charmap[row][col+1] = '0';
                        }
                    }
                }

            }
        return ans;
    }
}
