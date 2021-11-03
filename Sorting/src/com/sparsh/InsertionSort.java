package com.sparsh;

import java.util.Arrays;

public class InsertionSort   {
    public static void main(String[] args) {
        int[] array= {1,3,6,67,34,43,2,36,23};
        System.out.println(Arrays.toString(insertionsort(array)));
    }

    static void swap(int a, int b){
        int temp =b;
        b=a;
        a=temp;
    }

    static int[] insertionsort(int[] arr){
        for (int i=0; i<arr.length-2; i++){
            for (int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr[j],arr[j-1]);
                }else break;
            }
        }
        return arr;

    }
}
