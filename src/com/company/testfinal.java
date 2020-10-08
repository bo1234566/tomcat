package com.company;

import javafx.scene.chart.ScatterChart;

public class testfinal {
    public static void main(String[] arg) {

        int i = 0;
        test();

    }
        public static void test() {
            int a[] = new int[2];
            try {
                System.out.println("Access element three :" + a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown  :" + e);
                return;
            } finally {
                a[0] = 6;
                System.out.println("First element value: " + a[0]);
                System.out.println("The finally statement is executed");
                return;
            }
        }

}
