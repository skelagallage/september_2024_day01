package com.ucsc.automation.theory.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vihagi", "Navodya", "Pavithra", "Nipuni");
        List<String> namesStartWithN = names.stream().filter(x -> x.startsWith("N")).toList();
        System.out.println(namesStartWithN);
    }
}
