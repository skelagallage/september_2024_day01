package com.ucsc.automation.theory.streamandlambda;

import java.util.Random;
import java.util.function.Supplier;

public class Q5 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(0, 10);

        for (int i=0; i<5; i++){
            System.out.println(random.get());
        }
    }
}
