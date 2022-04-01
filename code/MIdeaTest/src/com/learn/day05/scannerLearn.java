package com.learn.day05;

import java.util.Scanner;

public class scannerLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String input = sc.nextLine();
        System.out.println(input);
        input = sc.next();
        System.out.println(input);
    }
}
