package com.company;

public class hakang01 {
    public static void main(String[] arg){
    int[] nums = {-3,-6,-2,-2,-7,-10,-20,-2,-2};
    hakang01 ha = new hakang01();
        int sum = ha.sum(nums);


    }
    public int sum(int[] nums){
        if(nums.length == 1)
            return nums[0];
        int res = nums[0];
        int tmp = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(tmp>=0){
                tmp+=nums[i];
            }
            else
                tmp = nums[i];
            res  = Math.max(tmp,res);
        }
        return res;
    }
}
