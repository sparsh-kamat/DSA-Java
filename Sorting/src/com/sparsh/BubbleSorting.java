package com.sparsh;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] unsortedArray= {23,32,34,11,13,24,53,224,324,12,};
        BubbleSort(unsortedArray);
    }

    static void BubbleSort (int[] unsortedArray){
        int temp;
        //run it n-1 times
        for (int i=0; i< (unsortedArray.length-1);i++ ){
            boolean swapped=false;
            int j=0 ;
            //parse through the array
            while (j< unsortedArray.length -1) {
                if(unsortedArray[j]>unsortedArray[j+1]){
                    //swap
                    temp= unsortedArray[j+1];
                    unsortedArray[j+1]=unsortedArray[j];
                    unsortedArray[j]=temp;
                    swapped = true;
                }
                j++;
            }
            //check if any swap occurred if not
            // it means array is already sorted
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(unsortedArray));
    }
}
