package com.ucsc.automation.theory;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("");

        for(int i=0; i<10; i++){
            stringBuffer.append(i + " ");
        }

        System.out.println(stringBuffer);
    }
}
