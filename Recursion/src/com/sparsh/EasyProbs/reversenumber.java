package com.sparsh.EasyProbs;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println(rev(3142405));
    }

    static int rev(int n){
        if(n<10){
            return n;
        }
        int digits=(int)Math.floor(Math.log10(n) + 1);
        return (int) ((n%10)*(Math.pow(10, digits-1))+(rev(n/10)));
    }
}
