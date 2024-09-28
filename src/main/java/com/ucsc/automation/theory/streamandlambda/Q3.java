package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vihagi", "Navodya", "Pavithra");
//        List<String> newNames = names.stream().map(x -> x.toUpperCase()).toList();
        List<String> newNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(newNames);
    }
}
