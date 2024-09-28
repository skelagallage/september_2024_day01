package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Chandima", "Subhagya", "Medhani");
        Collections.reverse(nameList);
        System.out.println(nameList);
    }
}
