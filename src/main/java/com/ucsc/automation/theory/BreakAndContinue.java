package com.ucsc.automation.theory;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            if(i==2){
//                break;
                continue;
            }
            System.out.println(i);
        }
    }
}
