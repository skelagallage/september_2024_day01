package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World", "...", "!");
        String joinedStr = String.join("-", stringList);
        System.out.println(joinedStr);
    }
}
