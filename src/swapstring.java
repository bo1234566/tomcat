

import java.util.Scanner;

public class swapstring {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb  = new StringBuilder();
        String swap = "";
        int n = sc.nextInt();

        {
            String dir2 =  sc.nextLine();
            String dir =  sc.nextLine();
            int lenofDir = dir.length();
            int countofdir = 0;
            int indexofswap = 0;
            for(int i = 0;i<lenofDir;i++){
                if(dir.charAt(i) == '>'){
                    countofdir++;
                    indexofswap = i;}
            }
            if(countofdir == 1){
                swap = dir.substring(indexofswap+1);
            }
            int left = -1;
            int right = -1;
            int count = 0;
            int indexleft = 0;
            int indexright = 0;
            int len = input.length();
            for(int i = 0;i<len-1;i++){
                if(input.charAt(i) == '{'&&input.charAt(i+1)=='{'){
                    count++;
                    indexleft = i;
                }
                if(input.charAt(i) == '}'&&input.charAt(i+1)=='}'){
                    count++;
                    indexright = i;
                }
            }
            if(indexleft ==(indexright-2)){
                System.out.println(input);
                return;
            }
            boolean flag = false;
            if(count == 2){
                for(int i = 0;i<len;i++){
                    if(i<indexleft)
                        sb.append(input.charAt(i));
                    if((i>indexleft+1)&&!flag){
                        sb.append(swap);
                        i = indexright+1;
                        flag = true;
                    }
                    if(i>indexright+1)
                        sb.append(input.charAt(i));
                }
                System.out.println(sb.toString());
            }
        }
    }

}
