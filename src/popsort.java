public class popsort {
    public static void main(String[] arg) {
        int[] nums = {3, 2, 1, 8, 4, 6};
//        for(int i = 0;i<nums.length-1;i++){
//            for(int j = 0;j<nums.length-1;j++){
//                if(nums[j] >nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        System.out.println(nums[0]);
    }
}
