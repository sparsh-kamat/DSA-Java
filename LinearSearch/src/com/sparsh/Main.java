package com.sparsh;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num= get.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements");
        for (int j=0; j<num; j++)
        {
           arr[j]= get.nextInt();
        }
        System.out.println("Enter number to search");
        int target= get.nextInt();
        int and= LinearSearch(arr,target);
        System.out.println("The vlaue is at "+ and);
    }

    //search  in the array: return the index if value is found
    //else return -1
    static int LinearSearch(int arr[], int target){
        int aa=0;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}
