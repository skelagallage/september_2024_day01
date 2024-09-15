package com.ucsc.automation.theory;

public class StringSplit {
    public static void main(String[] args) {
        String x = "Child is playing football";
        String[] arr = x.split(" ");

        for(String s : arr){
            System.out.println(s);
        }
    }
}
