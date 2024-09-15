package com.ucsc.automation.theory.pkg1;

public class ProtectedClass {

    protected int x = 3;

    public void display(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        new ProtectedClass().display();
    }
}
