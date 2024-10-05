package com.ucsc.automation.theory.streamandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,5,8,9,12);
        List<Integer> sqList = integerList.stream().map(x-> x*x).toList();
        System.out.println(sqList);
    }
}
