package com.sparsh.sorting;
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 234, 7, 8, 9, 12, 4932, 4636, 4366};
        System.out.println(Arrays.toString(mergesortthis(arr)));
    }

    static int[] mergesortthis(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid =arr.length/2;

        int[] left = mergesortthis(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesortthis(Arrays.copyOfRange(arr,mid,arr.length-1));

        return merge(left,right);


    }

    private static int[] merge(int[] left, int[] right){

        int[] comb = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i< left.length && j<right.length )
        {
            if(left[i] <right[j]){
                comb[k]=left[i];
                i++;
            }else {
                comb[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            comb[k]=left[i];
            i++;k++;
        }

        while(j<right.length){
            comb[k]=right[j];
            j++;k++;
        }

        return comb;
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}


