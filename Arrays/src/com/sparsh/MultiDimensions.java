package com.sparsh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensions {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the 9 number in 3 rows");
        int[][] integers =new int[3][3];

        for (int i = 0; i<3 ; i++)
            for (int j = 0; j<3; j++) {
                integers[i][j] = in.nextInt();
            }


        for (int i=0; i<3; i++)
        System.out.println(Arrays.toString(integers[i]));
    }
}
