import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pingantest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numsOfString = sc.nextLine().split(" ");
        int len = numsOfString.length;
        int[] nums = new int[len];
        int index = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<len;i++) {
            int temp = Integer.valueOf(numsOfString[i]);
            if (set.contains(temp))
                continue;
            else {
                set.add(temp);
                nums[index++] = temp;
            }
        }
        int[] res = new int[index];
for(int i = 0;i<index;i++){
    res[i]  = nums[i];
}
        Arrays.sort(res);
for(int i = index-1;i>=0;i--){
    System.out.println(res[i]+" ");
        }
    }
}
