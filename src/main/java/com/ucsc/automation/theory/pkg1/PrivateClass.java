package com.ucsc.automation.theory.pkg1;

public class PrivateClass {

    private int x = 3;

    public static void main(String[] args) {
        PrivateClass p = new PrivateClass();
        System.out.println(p.x);
    }
}
