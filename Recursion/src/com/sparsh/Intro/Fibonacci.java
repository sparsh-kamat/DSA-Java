package com.sparsh.Intro;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(6);
        System.out.println(fibo(6));
    }

    static int fibo(int i) {
        //base condition
        if(i<2){return i;}
        return fibo(i-1)+ fibo(i-2);
    }
}
