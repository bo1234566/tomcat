import java.util.Scanner;

public class meituan {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int bignum = 0;
        int smallnum = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                smallnum++;
            }
            else if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                bignum++;
            }
        }
        System.out.println(Math.abs(smallnum-bignum)/2);
    }
}
