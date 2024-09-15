package com.ucsc.automation.theory;

public class StaticDemo {

    private int x=1;
    private static int y=1;

    public StaticDemo(){
        x++;
        y++;
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        System.out.printf("x : %d and y : %d \n", s1.x, y);
        StaticDemo s2 = new StaticDemo();
        System.out.printf("x : %d and y : %d \n", s2.x, y);
        StaticDemo s3 = new StaticDemo();
        System.out.printf("x : %d and y : %d", s3.x, y);
    }
}
