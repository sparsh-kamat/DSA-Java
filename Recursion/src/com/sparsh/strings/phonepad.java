package com.sparsh.strings;

import java.util.ArrayList;
import java.util.List;

public class phonepad {
    public static void main(String[] args) {
        System.out.println(pad("","23"));


    }
    static List<String> pad(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0'; //make the char into a number

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=  (char)('a'+i);
            ans.addAll(pad (p+ch,up.substring(1)));

        }
        ans.removeAll()

        return ans;

    }
}
