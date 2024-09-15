package com.ucsc.automation.theory;

public class StringJoin {



    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};

        String s = String.join("-", arr);

        System.out.println(s);
    }
}
