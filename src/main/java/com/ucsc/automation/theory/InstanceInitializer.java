package com.ucsc.automation.theory;

public class InstanceInitializer {

    int x;

    {
        x = 10;
        System.out.println("Instance initalizer is executed with value of x : " + x);
    }

    public InstanceInitializer(){
        x = 20;
        System.out.println("Constructor is called with value of x : " + x);
    }

    public static void main(String[] args) {
        InstanceInitializer instanceInitializer = new InstanceInitializer();
    }
}
