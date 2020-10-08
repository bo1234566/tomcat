package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class qunaer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.nextLine();
        String[] charnum1 = new String[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] s1 = sc.nextLine().split(" ");
        int len = s1.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            String sun = s1[i].substring(1, s1[i].length());
            if (sun.equals("A"))
                num[i] = 1;
            if (sun.equals("10"))
                num[i] = 10;
            if (sun.equals("J"))
                num[i] = 11;
            if (sun.equals("Q"))
                num[i] = 12;
            if (sun.equals("K"))
                num[i] = 13;
        }
        test(num, 5);

    }
    public static void test(int[] a,int len){
        int[] b = new int[len];
        int count = 0;
        boolean temp = false;
        for (int i = 0; i < len; i++)
        {
            b[i] = a[i];
        }
        sort(b, 5);
        for (int i = 0; i < len - 1; i++)
        {
            if (b[i] == b[i + 1])
                count++;
        }
        switch (count)
        {
            case 0:
                if (b[0] - b[4] == 4 && b[0] - b[3] == 3 && b[0] - b[2] == 2 && b[0] - b[1] == 1)
                {
                    System.out.println("ShunZi");
                }
                else
                    System.out.println("GaoPai");
                break;
            case 1:
                System.out.println("YiDui");
                break;
            case 2:
                for (int i = 0; i < 3; i++)
                {
                    if (b[i] == b[i + 2])
                    {
                        System.out.println("SanTiao");
                        temp = true;
                        break;
                    }
                }
                if (!temp)
                {
                    System.out.println("LiangDui");
                }
                break;
            case 3:
                if (b[1] == b[3])
                    System.out.println("SiTiao");
                else
                    System.out.println("HuLu");
                break;
        }

    }


    public static void sort(int data[], int n)
    {
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (data[i] < data[j])
                {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }


}