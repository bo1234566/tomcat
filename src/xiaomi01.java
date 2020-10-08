import java.util.HashSet;
import java.util.Scanner;

public class xiaomi01 {
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    HashSet<Character> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<s.length();i++){
        if(set.contains(s.charAt(i)))
            continue;
        else{
            set.add(s.charAt(i));
            sb.append(s.charAt(i));
        }
    }
   System.out.println(sb.toString());
}

}
