package com.sparsh;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 2, 3,45,435,5,43,34);
        multiple(24 ,34 , "slkf" , "kdjf" ,"dfs" ,"fdf");

    }

    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple (int a , int b , String  ...v){
        System.out.println(Arrays.toString(v));
    }
}
