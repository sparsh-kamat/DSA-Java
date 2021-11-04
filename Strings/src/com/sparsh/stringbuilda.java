package com.sparsh;

public class stringbuilda {
    public static void main(String[] args) {
        StringBuilder builda = new StringBuilder();
        for (int i = 0; i< 26; i++){
            char ch= (char)('a'+i);
            builda.append(ch);

        }
        System.out.println(builda);
    }
}
