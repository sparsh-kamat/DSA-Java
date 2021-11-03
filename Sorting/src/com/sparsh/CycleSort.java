package com.sparsh;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] unsortedarray = {4,2,3,6,5,1};
        System.out.println(Arrays.toString(cyclesort(unsortedarray)));

    }
    static void swap(int[] unsortedarray, int i, int j){
        int temp= unsortedarray[j];
        unsortedarray[j]=unsortedarray[i];
        unsortedarray[i]=temp;
    }
    static int[] cyclesort(int[] unsortedarray){
        int i=0;
        while (i< unsortedarray.length){
            int correct= unsortedarray[i]-1;
            if (unsortedarray[i]!=unsortedarray[correct]){
                swap(unsortedarray,i,correct);
            }else i++;
        }
        return unsortedarray;
    }
}
