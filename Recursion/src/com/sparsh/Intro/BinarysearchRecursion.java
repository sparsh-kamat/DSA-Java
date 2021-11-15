package com.sparsh.Intro;

public class BinarysearchRecursion {
    public static void main(String[] args) {
        int[] arr= {0,2,3,4,5,6,7,9,12,14,23,46,52,56,65,67,89,232,423,432,436,31312};
         int target =5;
        System.out.println(BS(arr,target,0,arr.length-1));

    }
    static int BS(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid= (start+end)/2;

        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
           return BS(arr,target,start,mid-1);
        }
        else{
           return BS(arr,target,mid +1,end);
        }
    }

}
