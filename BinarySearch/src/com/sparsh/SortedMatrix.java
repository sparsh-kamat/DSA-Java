/* what are sorted matrix?
 stuff like 1  2  3  4
            5  6  7  8
            9 10 11 12
            which are sorted row wise.

 */
package com.sparsh;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {2,4,7,9},
                {12,13,14,15},
                {23,28,34,39},
                {45,52,73,95}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(matrix, target)));


    }

    static int[] binarysearch(int[][] matrix,int row,int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                cEnd=mid-1;
            }else{
                cStart=mid+1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix , int target){
        int rows= matrix.length;
        int cols=matrix[0].length;//be careful if matrix be not completely filled

        if (rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run loop until 2 rows remain
        while(rStart<(rEnd-1)){
            int mid = rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
