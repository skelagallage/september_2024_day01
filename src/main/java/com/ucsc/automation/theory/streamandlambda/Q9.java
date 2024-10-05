package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 6, 9, 33, 32, 8, 11);
        long count = integerList.stream().filter(x -> x%2 == 0).count();
        System.out.println(count);
    }
}
