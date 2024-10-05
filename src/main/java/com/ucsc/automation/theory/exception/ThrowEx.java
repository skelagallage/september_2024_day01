package com.ucsc.automation.theory.exception;

import java.util.Random;
import java.util.function.Supplier;

public class ThrowEx {

    public void myMethod(){

        Supplier<Integer> x = () -> new Random().nextInt(0, 10);

        if(x.get() == 3){
            throw new RuntimeException("My Exception");
        }else{
            System.out.println("No exception");
        }
    }

    public static void main(String[] args) {
        new ThrowEx().myMethod();
    }
}
