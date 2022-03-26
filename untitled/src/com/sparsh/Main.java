package com.sparsh;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(lettercombinations("",""));
    }
    static  List<String> lettercombinations(String p,String up){
        String[] words = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0'; //make the char into a number
        for(int y=0;y<words[digit].length();y++){
            char ch= words[digit].charAt(y);
            ans.addAll(lettercombinations(p+ch,up.substring(1)));
        }

        return ans;
    }

}
