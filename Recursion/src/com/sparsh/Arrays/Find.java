package com.sparsh.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,4932,4636,4366};
        System.out.println(findindex(9, arr,0));

    }

    static boolean find(int num, int[] arr, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==num || find(num, arr, index+1);
    }

    static int findindex(int num, int[] arr, int index){
        if(index== arr.length){
            return -1;
        }
        else if(arr[index]==num){
            return index;
        }else{
            return findindex(num, arr, index+1);
        }

    }
}
