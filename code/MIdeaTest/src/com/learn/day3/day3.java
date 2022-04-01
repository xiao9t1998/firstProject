package com.learn.day3;

import java.util.Random;

public class day3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i=0; i<10; ++i){
            int temp = rand.nextInt(10);
            System.out.println("本轮随机数为：" + temp);
        }
    }
}
