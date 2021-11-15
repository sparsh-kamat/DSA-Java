package com.sparsh.EasyProbs;

public class Nto1 {
    public static void main(String[] args) {
        upanddown(5);
    }

    static void nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nto1(--n);
    }

    static void reverse(int n) {
        if(n==0){
            return;
        }
        reverse(n-1);
        System.out.println(n);
    }

    static void upanddown(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        upanddown(n-1);
        System.out.println(n);
    }
}
