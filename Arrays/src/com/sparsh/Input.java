package com.sparsh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];

        int length = array.length;
        System.out.println("Enter the integers in the array");
        for (int i = 0; i<length; i++ )
        {
            array[i]= in.nextInt();
        }
        /*
        for (int j : array) { //FOR EVRY ELEMENT IN THE ARRAY PRINT THE ELEMENT
            System.out.println(j + " ");
        }

         */

        //Easier way to print arrays
        System.out.println(Arrays.toString(array));
    }
}