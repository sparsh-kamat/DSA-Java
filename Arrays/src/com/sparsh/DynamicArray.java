package com.sparsh;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] arr ={
                {2 ,3 ,6 ,4},
                {3, 6},
                {3, 6, 7}
        };

        //printing dynamic array
        for (int rows=0; rows<arr.length; rows++){
            for (int col=0; col<arr[rows].length; col++){
                System.out.print(arr[rows][col] + " " );
            }
            System.out.println();

        }
    }
}
