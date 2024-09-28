package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6,45, 83, 23, 32);
        List<Integer> evenNumberList = integerList.stream().filter(x -> x%2==0).toList();
        System.out.println(evenNumberList);
    }
}
