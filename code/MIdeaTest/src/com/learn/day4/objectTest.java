package com.learn.day4;

public class objectTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Apple", 4399);

        myPhone.call("18980656720");
        myPhone.setPrice(-11);
        System.out.println(myPhone.getBrand());
        System.out.println(myPhone.getPrice());
    }
}
