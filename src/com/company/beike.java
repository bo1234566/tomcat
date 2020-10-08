
package com.company;
import java.util.Scanner;
public class beike {
    public static int count = 0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T>0){
            T--;
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[][] out=new int [m][k];
            for (int i=0;i<m;i++){
                for(int j=0;j<k;j++){
                    out[i][j]=sc.nextInt();
                }
            }
            //int count = 0;
            int[] color=new int[n+1];
            dfs(out,n,m,k,color,1);
            System.out.println(count%1000000007);
        }
    }

    static void  dfs(int[][] out,int n,int m,int k,int[] color,int length){
        if(length==(n+1)){
            count++;
            return;}

        if(length == 1){
            for (int i=1;i<=m;i++){
                color[length] = i;
                length++;
                dfs(out,n,m,k,color,length);
                length--;
                color[length]=0;
            }
        }
        else {
            int temp=color[length-1];
            for(int i=1;i<=m;i++){
                for (int j=0;j<k;j++){
                    if(out[temp-1][j]==i ){
                        continue;
                    }

                    color[length]=i;
                    length++;
                    dfs(out,n,m,k,color,length);
                    length--;
                    color[length]=0;
                }

            }

        }

    }
}