package com.sparsh.strings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.println(permutationsList("","abc"));
    }

    static void perms( String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length();i++){
             String f= p.substring(0,i);
             String s= p.substring(i, p.length());
             perms(f+ch+s, up.substring(1));
        }

    }

    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}