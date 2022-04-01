package com.learn.day2;

import java.util.Random;
import java.util.Scanner;

public class day2 {
    char charAdd(int a, char b){
        return (char) (a+b);
    }
    char charAdd(char a, int b){
        return (char) (a+b);
    }
    int selfCount = 0;
    static int t2Count = 0;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 10;
        day2 d = new day2();
        d.t1();
        System.out.println(++a);
        System.out.println(a++);
        t2();
        t3();
        d.t4();
    }

    public void t1() {
        System.out.println("hello");
        this.t4();
        t2();
    }

    static public void t2() {
        System.out.println("static t2: " + ++day2.t2Count);
    }

    static public void t3() {
        t2();
        day2 d = new day2();
        d.t1();
    }

    public void t4() {
        System.out.println("static t4: " + ++this.selfCount);
    }
}
