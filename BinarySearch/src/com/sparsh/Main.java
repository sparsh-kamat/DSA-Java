package com.sparsh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");
        int len= in.nextInt();
        System.out.println("Enter Array elements");
        int[] array = new int[len];
        for (int i=0; i< array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.println("enter element to be searched");
        int target = in.nextInt();

        int start = 0; int end= array.length;
        while (start <= end) {
            int mid = (start+end)/2;
            if (array[mid]==target){
                System.out.println("Target is at index "+ mid);
                break;
            } else if(array[mid]>target){
                end= mid-1;
            } else if (array[mid] < target) {
                start = mid +1;
            }else System.out.println("Target not found");

        }

    }
}
