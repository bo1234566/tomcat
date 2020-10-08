package com.company;

public class huawei {
    public static void main(String[] args) {
        int[][] num = {{1,2,2,1},{3,1,2},{1,3,2},{2,4},{3,1,2},{1,3,1,1}};
        int res = solution(num);
    }
    public static int solution(int[][] nums){
        int len = nums.length;
        int[] sum = nums[0];
        int max = 0;
        for(int i = 0;i<sum.length;i++)
            max+=sum[i];

        int res = Integer.MAX_VALUE;
           for(int j = 1;j<max;j++){
               int pre = 0;
               for(int i = 0;i<len;i++){
                   int[] temp = nums[i];
                   int compare =temp[0];
                   for(int k = 0;k<temp.length;k++){

                       if(compare == j)
                           break;
                       else if(compare>j){
                         pre++;
                         break;
                       }
                       else {
                           if(k<temp.length-1)
                           compare = compare+temp[k+1];

                       }
                   }
           }

          res = Math.min(res,pre);
        }
        return  res;
    }

}
