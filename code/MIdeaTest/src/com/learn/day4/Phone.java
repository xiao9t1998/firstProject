package com.learn.day4;

public class Phone {
    private String brand;
    private float price;

    Phone(String brand, float price) {
        this.brand = brand;
        this.price = price;
    }

    Phone(String brand) {
        this.brand = brand;
        this.price = 0f;
    }

    Phone() {
        this.brand = "";
        this.price = 0f;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            System.out.println("价格输入不合法");
            return;
        }
        this.price = price;
    }

    public void call(String number) {
        System.out.println("正在拨通电话：" + number);
    }

    public void sendMessage(String content) {
        System.out.println("短信：" + content+ " 已发送");
    }

    public void show() {
        System.out.println(this.brand + this.price);
    }
}
