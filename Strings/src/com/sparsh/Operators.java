package com.sparsh;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //prints ascii value
        System.out.println("a" + "b"); //concatenates the 2 characters or words
        System.out.println((char)('a' + 3)); // the 'a' + 3 gives the ascii value of d which is converted
                                                // to char by the char keyword

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Sparsh" + new ArrayList<>());
        System.out.println("Sparsh" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');// even if one of the things is " " every element is taken as string
                                      // and not its ascii value
    }
}
