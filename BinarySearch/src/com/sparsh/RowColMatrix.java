package com.sparsh;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,13,23,44},
                {3,15,26,47},
                {7,19,35,53}
        };
        int target=19;
        System.out.println(Arrays.toString(search(matrix, target)));
    }


    static int[] search(int[][] matrix, int target){
        int r=0;
        int c= matrix.length -1;
         while (r< matrix.length && c>=0){
             if(matrix[r][c]==target){
                 return new int[]{r,c};
             }
             if (matrix[r][c]<target){
                 r++;
             }
             else{
                 c--;
             }
         }
         return new int []{-1,-1};
    }
}
