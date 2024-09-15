package com.ucsc.automation.theory.pkg1;

public class DemoClass {

    public static void main(String[] args) {
        PrivateClass p = new PrivateClass();
//        System.out.println(p.x); /* Cannot access */

        ProtectedClass p2 = new ProtectedClass();
        System.out.println(p2.x);
    }
}
