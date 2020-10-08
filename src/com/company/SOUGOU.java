package com.company;
import java.util.*;


public class SOUGOU {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     * @param t int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public static void main(String[] arg){
        int[] nums = {-1,4,5,2};
        int t = 2;
        int res = getHouses(t,nums);
    }
    public static  int getHouses (int t, int[] xa) {
        // write code here
        int len = xa.length;
        int right = xa[len-2];
        int left = xa[0];
        boolean[] state =  new boolean[right-left+xa[len-1]];
        for(int i = 0;i<len;i = i+2){
            int point = xa[i];
            int area = xa[i+1];
            for(int j = point-left;j<area+point-left;j++){
                state[j] = true;
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        //for(int i = 0;i<state.length;i++){
        int start = 0;

        while(start<state.length){
            if(state[start] == false){
                int index = start;
                while(state[index] == false){
                    index++;
                }

                int areasofempty = index-start;
                start = index;
                if(areasofempty>=t-1)
                    count+=2;
                else if(areasofempty+1 == t)
                    count+=1;

            }
            else start++;

        }
        return count+2;
    }
}