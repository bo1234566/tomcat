package com.company;
import java.util.*;
public class acs
{
    public static void main(String[] arg){
        int a = 10;
        int ans = solution(a);
    }

        /**
         * @param n: 正整数
         * @return: 计算结果
         */
        private static int ans = 0;
        public static List<Integer> list = new LinkedList<>();
        public static int solution(int n) {
            int count = 0;
            int temp = n;
            while(temp!=0){
                count++;
                temp = temp/10;
            }
            int[] nums = new int[count];

            while(count!=0){
                count--;
                nums[count] = n%10;
                n = n/10;
            }

            dfs(nums,0);
            return ans;
        }
        public static void dfs(int[] nums,int start){
            if(start == nums.length ||ans == 1){
                if(judge(list)){
                    ans  = 1;
                    return;
                }
                return;
            }
            for(int i = start;i<nums.length;i++){
                if(list.size() == 0 && nums[i] == 0)
                    continue;
                if(i!=start && nums[i] == nums[i-1])
                    continue;
                list.add(nums[i]);
                dfs(nums,i+1);
                list.remove(list.size()-1);

            }
        }
        public static boolean judge(List<Integer> list){

            StringBuilder sb =  new StringBuilder();
            for(int i = 0;i<list.size();i++){
                sb.append(list.get(i));
            }
            int ans = Integer.valueOf(sb.toString());
            while(ans%3 == 0){
                ans = ans/3;
            }
            if(ans == 1)
                return true;
            else
                return false;
        }

    }



