package com.sparsh.EasyProbs;

public class productofdigits {
    public static void main(String[] args) {
        System.out.println(prod(123045));
    }

    static int prod(int n){
        if(n<10 && n!=0){
            return n;
        }

        return ((n%10)*prod(n/10));
    }
}
