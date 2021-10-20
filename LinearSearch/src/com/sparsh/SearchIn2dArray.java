package com.sparsh;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            int[] ints = arr[i];
            for (int j = 0, intsLength = ints.length; j < intsLength; j++) {
                int element = ints[j];
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
