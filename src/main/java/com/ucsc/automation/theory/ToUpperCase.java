package com.ucsc.automation.theory;

public class ToUpperCase {
    public static void main(String[] args) {
        String a = "Apple";
        String b = "apple";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String c = a.toUpperCase();
        String d = b.toUpperCase();

        System.out.println(c.equals(d));
    }
}
