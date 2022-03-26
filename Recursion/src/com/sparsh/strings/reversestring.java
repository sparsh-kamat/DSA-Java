package com.sparsh.strings;

public class reversestring {
    public static void main(String[] args) {

    }

    static void swap(char []arr, int i, int j)
    {
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseString(char[] s,int i) {
        int n = s.length;
        if (i == n / 2)
            return;
        swap(s,i,n - i - 1);
        reverseString(s, i + 1);
    }

}
