package com.sparsh;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray= {23,32,34,11,13,24,53,224,324,12,};
        System.out.println(Arrays.toString(selectionSort(unsortedArray)));
    }

    static int[] selectionSort(int[] unsortedarray){
        for (int i=0; i< unsortedarray.length;i++){
            //find max item in current array and swap with correct index
            int last = unsortedarray.length - i -1;
            int maxIndex = getMaxIndex(unsortedarray,last);
            swap(unsortedarray,maxIndex,last);
        }
        return unsortedarray;


    }

    static void swap(int[] unsortedarray, int i, int j){
        int temp= unsortedarray[j];
        unsortedarray[j]=unsortedarray[i];
        unsortedarray[i]=temp;
    }
    private static int getMaxIndex(int[] unsortedarray, int last) {
        int max =0;
        for(int o=0; o<last; o++){
            if(unsortedarray[max]<unsortedarray[o]) max = o;
        }
        return max;

    }
}
