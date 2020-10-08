package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ali {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lenofStr = str.length();
        int currWindowLeftIndex = 0;
        int maxLength = 0;
        int leftIndexofres = 0;
        HashMap<Character,Integer> mapofwindow = new HashMap<>();
        for(int i = 0;i<lenofStr;i++){
            if(mapofwindow.containsKey(str.charAt(i)) && mapofwindow.get(str.charAt(i))>=currWindowLeftIndex){
                currWindowLeftIndex  = mapofwindow.get(str.charAt(i))+1;
            }
            mapofwindow.put(str.charAt(i),i);
            if(maxLength<i-currWindowLeftIndex+1){
                maxLength = i-currWindowLeftIndex+1;
                leftIndexofres = currWindowLeftIndex;
            }
        }
        System.out.println(str.substring(leftIndexofres,leftIndexofres+maxLength));

    }
}
