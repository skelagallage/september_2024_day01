package com.ucsc.automation.theory.streamandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 45, 87, 34, 20, 1, 99, 292, 4);
        Optional<Integer> max = integerList.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
