package com.sparsh.EasyProbs;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }

    static int rev(int n){
        if(n<10){
            return n;
        }
        return ((n%10)+(rev(n/10)*10));
    }
}
